/*
Question:
Given a list of integers, perform the following queries:

1. Insert x y
   -> Insert value y at index x.

2. Delete x
   -> Delete the element at index x.

After performing all queries, print the final list.
*/

import java.util.*;

public class Solve {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read initial size of the list
        int n = sc.nextInt();

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Read list elements
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Read number of queries
        int q = sc.nextInt();

        // Process each query
        for (int i = 0; i < q; i++) {

            // Read query type
            String query = sc.next();

            // Insert operation
            if (query.equals("Insert")) {

                // Read index and value
                int index = sc.nextInt();
                int value = sc.nextInt();

                // Insert value at given index
                list.add(index, value);
            }

            // Delete operation
            else if (query.equals("Delete")) {

                // Read index to delete
                int index = sc.nextInt();

                // Remove element at given index
                list.remove(index);
            }
        }

        // Print final list
        for (int num : list) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
