import java.util.Scanner;

public class GroceryList {
   private String groceryName;
   private int groceryPrice;
   private int groceryAmount;
   private GroceryList[] groceryList;
   private Scanner scanner = new Scanner(System.in);


    //This method will add items to the list if there is room
    private void addItem(){
        int arrayLength = groceryList.length;
        int n = arrayLength++;
        int index = 0;
        String inputNavn;
        int antal;

        if (arrayLength < 11){
            System.out.println("Intast navn på vare:");
            inputNavn = scanner.nextLine();
            /*
            groceryList[index] = 
*/

        }

    }


    public String getGroceryName() {
        return groceryName;
    }

    public void setGroceryName(String groceryName) {
        this.groceryName = groceryName;
    }

    public int getGroceryPrice() {
        return groceryPrice;
    }

    public void setGroceryPrice(int groceryPrice) {
        this.groceryPrice = groceryPrice;
    }

    public int getGroceryAmount() {
        return groceryAmount;
    }

    public void setGroceryAmount(int groceryAmount) {
        this.groceryAmount = groceryAmount;
    }

    public GroceryList[] getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(GroceryList[] groceryList) {
        this.groceryList = groceryList;
    }
}
