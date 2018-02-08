/*
The GroceryItemOrder class should have an item name, a quantity, and a price per unit, and it should have a constructor setting all these values,
and one only setting the name(the default quantity should be one).
It should have a getCost-method returning the total cost of the item in its given quantity,
and a toString-method returning a String with the name, quantity, and total cost. All fields should have getter and setter methods.
 */


public class GroceryItemOrder {
    private String name;
    private double prize;
    private int amout;

    public GroceryItemOrder(String name, double prize, int amout) {
        this.name = name;
        this.prize = prize;
        this.amout = amout;
    }

    public double getCost(){
        return prize * amout;
    }

    @Override
    public String toString() {
        return
                "Name: " + name + " " +
                "Amout: " + amout + " " +
                "Total cost: " + getCost() +
                ']'+'\n';
    }
}

