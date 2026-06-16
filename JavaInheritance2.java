/*
Question:
Create a class Arithmetic with a method add()
that returns the sum of two integers.

Create another class Adder that inherits
from Arithmetic.

The add() method should return:
a + b
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Parent class
class Arithmetic {

    // Return sum of two numbers
    int add(int a, int b) {
        return a + b;
    }
}

// Child class inheriting Arithmetic
class Adder extends Arithmetic {
    // No extra code needed
}

public class Solution {

    public static void main(String[] args) {

        // Create Adder object
        Adder a = new Adder();

        // Print superclass name
        System.out.println("My superclass is: "
                + a.getClass().getSuperclass().getName());

        // Call add method
        System.out.print(
                a.add(10, 32) + " " +
                a.add(10, 3) + " " +
                a.add(10, 10) + "\n"
        );
    }
}
