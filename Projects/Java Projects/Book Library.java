class library {
    String[] books;
    int noOfBooks;

    library() {
        this.books = new String[100];
        this.noOfBooks = 0;
    }
    void issueBook(String book) {
        for (int i=0; i<this.books.length; i++){
          if (this.books[i].equals(book)){
              System.out.println("Book has been issued!");
              this.books[i]= null;
          }
        }
        System.out.println("This book does not exist!");
              return;
    }

    void returnBook(String book) {
        addBook(book);
    }

    void addBook(String book) {
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " Book has been added.");
    }

    void showAvailableBooks() {
        System.out.println("Available books are : ");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

}

    public class Book_Library {
        public static void main(String[] args) {
            // You have to implement a library using java class library
            // Methods : issueBook, returnBook, showAvailableBooks, addBook,
            // Properties : Array to store the available books
            // Properties : Array to store the available books

            library centralLibrary = new library();
            centralLibrary.addBook("It Ends With Us");
            centralLibrary.addBook("It Starts With Us");
            centralLibrary.addBook("It Between Us");
            centralLibrary.showAvailableBooks();

            centralLibrary.issueBook("It Ends With Us");
            centralLibrary.showAvailableBooks();
            centralLibrary.returnBook("It Ends With Us");
            centralLibrary.showAvailableBooks();

        }
    }
