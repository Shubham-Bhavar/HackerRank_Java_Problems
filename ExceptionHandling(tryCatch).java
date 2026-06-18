/*
Question:
Read two integers a and b.

Print:
a / b

Handle exceptions:
1. InputMismatchException
2. ArithmeticException (/ by zero)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Read two integers
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Print division result
            System.out.println(a / b);

        }
        catch (InputMismatchException e) {

            // Invalid input
            System.out.println("java.util.InputMismatchException");

        }
        catch (ArithmeticException e) {

            // Division by zero
            System.out.println(e);
        }

        sc.close();
    }
}
