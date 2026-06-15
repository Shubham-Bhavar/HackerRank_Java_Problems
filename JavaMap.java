/*
Question:
Create a phone book using HashMap.

Input:
- Store n people's names and phone numbers.
- Then read names until end of input.

Output:
- If name exists, print: name=phoneNumber
- Otherwise print: Not found
*/

import java.util.*;
import java.io.*;

class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Read number of phone book entries
        int n = in.nextInt();
        in.nextLine();

        // Create HashMap to store name and phone number
        HashMap<String, String> map = new HashMap<>();

        // Store phone book entries
        for (int i = 0; i < n; i++) {

            // Read person's name
            String name = in.nextLine();

            // Read phone number
            String phone = in.nextLine();

            // Store name and phone number in HashMap
            map.put(name, phone);
        }

        // Process queries until end of input
        while (in.hasNext()) {

            // Read query name
            String name = in.nextLine();

            // Check if name exists in phone book
            if (map.containsKey(name)) {

                // Print name and phone number
                System.out.println(name + "=" + map.get(name));
            } else {

                // Name not found
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
