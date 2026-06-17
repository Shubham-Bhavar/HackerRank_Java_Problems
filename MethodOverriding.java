/*
Question:
Override the getNumberOfTeamMembers() method
in the Soccer class.

Print:
Each team has 11 players in Soccer Class

Output:
Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class
*/

import java.util.*;

class Sports {

    // Return sport name
    String getName() {
        return "Generic Sports";
    }

    // Print team members
    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

// Child class
class Soccer extends Sports {

    // Override getName method
    @Override
    String getName() {
        return "Soccer Class";
    }

    // Override getNumberOfTeamMembers method
    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class Solution {

    public static void main(String[] args) {

        Sports c1 = new Sports();

        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();

        Soccer c2 = new Soccer();

        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}
