package LibraryManagement;

import java.util.ArrayList;

public class LibraryUtility {

    public static void displaySystemMessage() {
        System.out.println("Library Management System Started");
        System.out.println();
    }

    public static int countTotalBooks(ArrayList<LibraryBook> books) {
        return books.size();
    }

    public static void main(String[] args) {

        displaySystemMessage();

        LibraryBook b1 = new LibraryBook("Java", 1, "James");
        LibraryBook b2 = new LibraryBook("OOP", 2, "Herbert", "OOP Concepts");
        ReferenceBook r1 = new ReferenceBook("Dictionary", 3, "Oxford");

        b1.issueBook("Rahul");
        b2.issueBook("Amit", 10);
        r1.issueBook("Neha");

        b1.returnBook();

        b1.displayBookDetails();
        b2.displayBookDetails();
        r1.displayBookDetails();

        ArrayList<LibraryBook> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(r1);

        System.out.println("Total Books : " + countTotalBooks(list));
    }
}
