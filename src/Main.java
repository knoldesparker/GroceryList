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
        GroceryItemOrder gil = new GroceryItemOrder("Pasta", 18.5, 5);
        GroceryItemOrder gil2 = new GroceryItemOrder("Tomat", 10.0, 2);
        GroceryItemOrder gil3 = new GroceryItemOrder("Løg", 15, 1);
        GroceryItemOrder gil4 = new GroceryItemOrder("Hvidløg", 10, 1);





        gl.addItem(gil);
        gl.addItem(gil2);
        gl.addItem(gil3);
        gl.addItem(gil4);
        gl.addItem(gil);
        gl.addItem(gil);
        gl.addItem(gil);
        gl.addItem(gil);
        gl.addItem(gil);
        gl.addItem(gil);
        gl.addItem(gil);
        gl.addItem(gil);
        gl.addItem(gil);
        gl.addItem(gil);
        gl.addItem(gil);
        gl.addItem(gil);

        System.out.println(gl);
        System.out.println(gl.getTotalCost());
    }
}
