package Test1;
//5.Construct a Book class with attributes like bookId, bookTitle, and author. Implement a constructor to
// initialize these attributes and another method getDetails() to display book information.
public class Book {
    int bookId;
    String bookTitle;
    String author;
    Book(int bookId,String bookTitle,String author){
        this.bookId=bookId;
        this.bookTitle=bookTitle;
        this.author=author;
    }
    void getDetails(){
        System.out.println("Details of the book:");
    }
    public static void main(String[] args) {
        Book ob1=new Book(101,"Gora","Rabindranath Tagore");
        ob1.getDetails();
        System.out.println("Book Id= "+ob1.bookId+"\tBook name= "+ob1.bookTitle+" \tAuthorof this book is= "+ob1.author);
        Book ob2=new Book(201,"The Guide","R. K. Narayan");
        System.out.println("Book Id= "+ob2.bookId+"\tBook name= "+ob2.bookTitle+" \tAuthorof this book is= "+ob2.author);
    }
}
