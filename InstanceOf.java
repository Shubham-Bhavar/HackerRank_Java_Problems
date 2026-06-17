/*
Question:
Count how many objects belong to:
1. Student
2. Rockstar
3. Hacker

Use instanceof operator.

Example:
Input:
Student
Student
Rockstar
Student
Hacker

Output:
3 1 1
*/

static String count(ArrayList<Object> mylist) {

    int student = 0;
    int rockstar = 0;
    int hacker = 0;

    // Check type of each object
    for (Object obj : mylist) {

        if (obj instanceof Student) {
            student++;
        }
        else if (obj instanceof Rockstar) {
            rockstar++;
        }
        else if (obj instanceof Hacker) {
            hacker++;
        }
    }

    // Return counts
    return student + " " + rockstar + " " + hacker;
}
