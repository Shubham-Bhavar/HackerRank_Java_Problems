/*
Question:
Create a class MyCalculator with method:

long power(int n, int p)

Rules:
1. If n < 0 or p < 0
   throw Exception:
   "n or p should not be negative."

2. If n = 0 and p = 0
   throw Exception:
   "n and p should not be zero."

3. Otherwise return n raised to power p.
*/

class MyCalculator {

    // Calculate n^p
    long power(int n, int p) throws Exception {

        // Check negative values
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }

        // Check both values are zero
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        // Return n raised to power p
        return (long) Math.pow(n, p);
    }
}
