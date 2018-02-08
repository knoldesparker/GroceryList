import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.FileHandler;

public class GroceryList {

    private ArrayList<GroceryItemOrder> inventoryItem;
    /*
    The GroceryList class should use an array to store the grocery item orders.
    Assume that a grocery list will have no more than 10 item orders.
    The GroceryList class should have an add-method that will add a given item order to the list if the list has fewer than 10 items,
    and a getTotalCost-method that will return the total sum cost of all grocery item orders in this list.
    It should also have a toString-method.
     */
    //Variables
    private final int START_CAPACITY = 10;
    private int pointer;
    private double totalCost;

    //makes the array from the GroceryItemOrder Class
    public GroceryList (){
        this.inventoryItem = readItemData();

    }
    private ArrayList<GroceryItemOrder> readItemData()
    {
        return new READFILE().readItemFile();
    }

    //This method will add items to the array w/ try/catch
    public void displayList(){
       try {
           for (int i = 0; i < this.inventoryItem.size(); i++)
           {
               System.out.println(i + ": " + this.inventoryItem.get(i));
           }
       }
       //If no more room in the array, print out the error
       //Stops the program from crashing if addItem goes above the index
       catch (IndexOutOfBoundsException iOOBE){
           System.out.println("No more room in the list");
       }
    }
    public void addListItem(GroceryItemOrder itemOrder){

    }

    public double getTotalCost(){
       double value = 0.0;
           for (GroceryItemOrder gio : inventoryItem) {
               if (gio != null) {
                   value += gio.getCost();
               }
           }
        return value;
    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "inventoryItem=" + inventoryItem +
                '}';
    }
}