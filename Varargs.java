/*
Problem:
Create a class Add with a method add() that accepts
a variable number of integers and prints their sum
in the required format.
*/

class Add {

    // Method using Varargs to accept multiple integers
    public void add(int... numbers) {

        // Variable to store the sum
        int sum = 0;

        // Traverse all numbers
        for (int i = 0; i < numbers.length; i++) {

            // Add current number to sum
            sum += numbers[i];

            // Print current number
            System.out.print(numbers[i]);

            // Print '+' after each number except the last one
            if (i < numbers.length - 1) {
                System.out.print("+");
            }
        }

        // Print '=' followed by the total sum
        System.out.println("=" + sum);
    }
}
