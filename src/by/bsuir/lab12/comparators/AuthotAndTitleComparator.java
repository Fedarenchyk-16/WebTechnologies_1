package by.bsuir.lab12.comparators;

import by.bsuir.lab12.Book;

import java.util.Comparator;

public class AuthotAndTitleComparator implements Comparator<Book> {

   private Comparator<Book> ATComparator;

   public AuthotAndTitleComparator(){
      this.ATComparator = new AuthorComparator().thenComparing(new TitleComparator());
   }
   @Override
   public int compare(Book o1, Book o2) {
      return ATComparator.compare(o1, o2);
   }
}
