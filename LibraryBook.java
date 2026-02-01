package LibraryManagement;

public class LibraryBook extends BookItem {

    private boolean isAvailable = true;
    private String issuedTo = "None";
    private String description;

    // Constructor 1
    public LibraryBook(String title, int bookId, String author) {
        super(title, bookId, author);
        this.description = "No description";
    }

    // Constructor 2
    public LibraryBook(String title, int bookId, String author, String description) {
        super(title, bookId, author);
        this.description = description;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Title : " + title);
        System.out.println("Book Id : " + bookId);
        System.out.println("Author : " + author);
        System.out.println("Description : " + description);
        System.out.println("Available : " + isAvailable);
        System.out.println("Issued To : " + issuedTo);
        System.out.println();
    }

    public void issueBook(String studentName) {
        if (isAvailable) {
            isAvailable = false;
            issuedTo = studentName;
            System.out.println("Book issued to " + studentName);
        } else {
            System.out.println("Book already issued");
        }
    }

    // Method Overloading
    public void issueBook(String studentName, int days) {
        issueBook(studentName);

        if (days > MAX_ISSUE_DAYS) {
            System.out.println("Issue days exceed limit");
        }
    }

    public void returnBook() {
        isAvailable = true;
        issuedTo = "None";
        System.out.println("Book returned");
    }
}
