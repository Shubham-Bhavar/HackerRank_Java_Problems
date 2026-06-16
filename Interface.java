/*
Question:
Implement the interface AdvancedArithmetic.

Create a class MyCalculator that implements
the method divisor_sum(int n).

The method should return the sum of all divisors of n.

Example:
Input: 6

Divisors: 1, 2, 3, 6

Output: 12
*/

import java.util.*;

// Interface
interface AdvancedArithmetic {

    // Method signature
    int divisor_sum(int n);
}

// Class implementing the interface
class MyCalculator implements AdvancedArithmetic {

    // Implement divisor_sum method
    public int divisor_sum(int n) {

        int sum = 0;

        // Check all numbers from 1 to n
        for (int i = 1; i <= n; i++) {

            // If i is a divisor of n
            if (n % i == 0) {

                // Add divisor to sum
                sum += i;
            }
        }

        // Return total sum of divisors
        return sum;
    }
}
