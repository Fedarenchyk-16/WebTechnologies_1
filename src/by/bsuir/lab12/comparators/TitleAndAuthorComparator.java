package by.bsuir.lab12.comparators;

import by.bsuir.lab12.Book;

import java.util.Comparator;

public class TitleAndAuthorComparator implements Comparator<Book> {

      private Comparator<Book> TAComparator;

      public TitleAndAuthorComparator() {
         this.TAComparator = new TitleComparator().thenComparing(new AuthorComparator());
      }

      @Override
      public int compare(Book o1, Book o2) {
         return TAComparator.compare(o1, o2);
      }
}
