import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class READFILE {
    public ArrayList<GroceryItemOrder> readItemFile()
    {
        File file = new File("GroceryList.txt");
        ArrayList<GroceryItemOrder> items = new ArrayList<>();
        try
        {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine())
            {
                String nextLine = scanner.nextLine();

                String[] item = nextLine.split(";");
                items.add(new GroceryItemOrder(item[0],
                        Double.parseDouble(item[1]),
                        Integer.parseInt(item[2]))
                );
            }
            scanner.close();
        }
        catch (FileNotFoundException eFNF)
        {
            eFNF.printStackTrace();
        }

        return items;
    }
}
