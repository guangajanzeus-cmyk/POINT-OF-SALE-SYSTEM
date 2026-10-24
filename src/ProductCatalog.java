import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ProductCatalog {


    public static void viewAllProduct(Product product) {
        String file = "C:\\Users\\DELL\\IdeaProjects\\POINT-OF-SALE SYSTEM\\src\\POS ITEM LIST product FILE\\PRODUCT CATALOG LIST ITEM.txt";

        ArrayList<String> item = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND!");
        } catch (IOException e) {
            System.out.println("SOMETHINGS WRONG!");
        }
    }
}
