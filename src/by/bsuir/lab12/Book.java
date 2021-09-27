package by.bsuir.lab12;

public class Book implements Comparable<Book>, Cloneable
{
   private String title ;
   private String author;
   private int price;
   private static int edition;
   private int isbn;

   public Book(String title, String author, int price, int isbn){
      this.title = title;
      this.author = author;
      this.price = price;
      this.isbn = isbn;
   }

   public String getTitle() {
      return title;
   }

   public String getAuthor() {
      return author;
   }

   public int getPrice() {
      return price;
   }

   public static int getEdition() {
      return edition;
   }

   @Override
   public String toString(){
      return "Book: " + title + " - " + author + ". Price: " + price;
   }

   @Override
   public int hashCode(){
      return 2 * title.hashCode() + 2 * author.hashCode() + 2 * price;
   }

   @Override
   public boolean equals(Object o){
      if(o == this)
         return true;
      if(!(o instanceof Book))
         return false;

      Book book = (Book)o;
      return  book.title == title &&
              book.author == author;
   }

   @Override
   public Book clone() throws CloneNotSupportedException {
      Book clonedBook = (Book) super.clone();
      clonedBook.isbn = this.isbn;
      return clonedBook;
   }

   @Override
   public int compareTo(Book o) {
      if (o == null)
         throw new NullPointerException();

      if (this.isbn - o.isbn > 0)
         return 1;
      if (this.isbn - o.isbn < 0)
         return -1;

      return 0;
   }
}