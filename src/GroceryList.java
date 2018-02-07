import java.util.Arrays;

public class GroceryList {

    /*
    The GroceryList class should use an array to store the grocery item orders.
    Assume that a grocery list will have no more than 10 item orders.
    The GroceryList class should have an add-method that will add a given item order to the list if the list has fewer than 10 items,
    and a getTotalCost-method that will return the total sum cost of all grocery item orders in this list.
    It should also have a toString-method.
     */
    private final int START_CAPACITY = 10;
    private GroceryItemOrder[] groceryItemOrders;
    private int pointer;
    private double totalCost;

    public GroceryList (){
        this.groceryItemOrders = new GroceryItemOrder[START_CAPACITY];

    }

    //This method will add items to the list if there is room
    public void addItem(GroceryItemOrder GIO){
        groceryItemOrders[pointer] = GIO;
        pointer++;
    }

    public double getTotalCost(){
       double value = 0.0;
           for (GroceryItemOrder gio : groceryItemOrders) {
               if (gio != null) {
                   value += gio.getCost();
               }
           }


        return value;
    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "groceryItemOrders=" + Arrays.toString(groceryItemOrders) +
                '}';
    }
}