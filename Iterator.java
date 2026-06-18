/*
Question:
Print only the elements that come
after the special string "###".

Example:

42
10
###
Hello
Java

Output:
Hello
Java
*/

static Iterator func(ArrayList mylist) {

    Iterator it = mylist.iterator();

    // Move iterator until "###" is found
    while (it.hasNext()) {

        Object element = it.next();

        if (element.equals("###")) {
            break;
        }
    }

    // Return iterator positioned after ###
    return it;
}
