/*
Question:
Create a Bird class using inheritance.

- Animal class has a walk() method.
- Bird class extends Animal and has:
  1. fly() method
  2. sing() method

Print:
I am walking
I am flying
I am singing
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Parent class
class Animal {

    // Method to walk
    void walk() {
        System.out.println("I am walking");
    }
}

// Child class inheriting Animal
class Bird extends Animal {

    // Method to fly
    void fly() {
        System.out.println("I am flying");
    }

    // Method to sing
    void sing() {
        System.out.println("I am singing");
    }
}

public class Solution {

    public static void main(String[] args) {

        // Create Bird object
        Bird bird = new Bird();

        // Call inherited method
        bird.walk();

        // Call Bird methods
        bird.fly();
        bird.sing();
    }
}
