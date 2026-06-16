/*
Question:
Create a class MyBook that extends
the abstract class Book.

Implement the abstract method:
setTitle(String s)

Store the given title and print it.

Example:
Input:
A tale of two cities

Output:
The title is: A tale of two cities
*/

import java.util.*;

// Abstract parent class
abstract class Book {

    String title;

    // Abstract method
    abstract void setTitle(String s);

    // Return book title
    String getTitle() {
        return title;
    }
}

// Child class extending Book
class MyBook extends Book {

    // Implement abstract method
    void setTitle(String s) {

        // Store title
        title = s;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read book title
        String title = sc.nextLine();

        // Create MyBook object
        MyBook new_novel = new MyBook();

        // Set title
        new_novel.setTitle(title);

        // Print title
        System.out.println("The title is: " + new_novel.getTitle());

        sc.close();
    }
}
