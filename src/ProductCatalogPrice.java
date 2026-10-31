import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductCatalogPrice {


    public static final ArrayList<Product> viewPrice(Product product)
    {
        String filepath = "C:\\Users\\DELL\\IdeaProjects\\POINT-OF-SALE SYSTEM\\src\\POS ITEM LIST product FILE\\PRODUCT CATALOG LIST PRICE";

        ArrayList<Integer> price = new ArrayList<>();

        try (BufferedReader priceFile = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = priceFile.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        return null;
    }


}
