package by.bsuir.lab13;

import by.bsuir.lab12.Book;

public class ProgrammerBook extends Book {

   private String language;
   private int level;

   public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
      super(title, author, price, isbn);
      this.language = language;
      this.level = level;
   }

   @Override
   public String toString(){
      return super.toString() + "( " + language + "/" + level + " )";
   }

   @Override
   public int hashCode(){
      return super.hashCode() + 2* language.hashCode();
   }

   @Override
   public boolean equals(Object o){
      ProgrammerBook pBook = (ProgrammerBook)o;
      return super.equals(pBook) && (pBook.level == level);
   }

}
