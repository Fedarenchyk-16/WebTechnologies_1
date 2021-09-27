package by.bsuir.lab12.comparators;

import by.bsuir.lab12.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {
   private Comparator<Book> ATPComparator;

   public AuthorTitlePriceComparator() {
      this.ATPComparator = new AuthorTitlePriceComparator().thenComparing(new PriceComparator());
   }

   @Override
   public int compare(Book o1, Book o2) {
      return ATPComparator.compare(o1, o2);
   }
}
