/*
Question:
Use the super keyword to call
the parent class method.

Output:
Hello I am a motorcycle, I am a cycle with an engine.
My ancestor is a cycle who is a vehicle with pedals.
*/

class Bicycle {

    // Parent class method
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class Motorcycle extends Bicycle {

    // Child class method
    String define_me() {
        return "a cycle with an engine.";
    }

    Motorcycle() {

        // Call parent class method using super
        System.out.println(
            "Hello I am a motorcycle, I am " + define_me()
        );

        System.out.println(
            "My ancestor is a cycle who is " + super.define_me()
        );
    }
}

class Solution {

    public static void main(String[] args) {

        // Create Motorcycle object
        Motorcycle M = new Motorcycle();
    }
}
