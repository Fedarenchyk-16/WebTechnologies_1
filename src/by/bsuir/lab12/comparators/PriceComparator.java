package by.bsuir.lab12.comparators;

import by.bsuir.lab12.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

   @Override
   public int compare(Book o1, Book o2) {
      return o1.getPrice() - o2.getPrice();
   }
}