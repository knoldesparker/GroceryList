public class Main {
    /*
    Make a test class with a main-method that instantiates the GroceryList, fill it with GroceryItemOrder-objects, and print it.
    Test what happens if you try to add a grocery item order when the list is filled.
    Instead of writing the names of the items when instantiating them in the test class,
    try to read them from a file. Make a .txt file with a number of grocery names in it, to test it.
    Make a new version of GroceryList (name it GroceryList2).
    Change the implementation of the GroceryList2 to use an ArrayList instead of an array.

     */
    public static void main(String[] args) {
        GroceryList gl = new GroceryList();


        System.out.println(gl);
        System.out.println(gl.getTotalCost());
    }
}
