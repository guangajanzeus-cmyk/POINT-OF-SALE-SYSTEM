import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class ProductCatalog {

    public static ArrayList<Product> viewAllProduct() {

        String file = "C:\\Users\\DELL\\IdeaProjects\\POINT-OF-SALE SYSTEM\\src\\POS ITEM LIST product FILE\\PRODUCT CATALOG LIST ITEM.txt";

        ArrayList<Product> products = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(", ");

                int ID = Integer.parseInt(data[0]);
                String name = data[1];
                BigDecimal price = new BigDecimal(data[2]);
                int quantity = Integer.parseInt(data[3]);

                Product product = new Product(name, price, quantity, ID);

                products.add(product);
            }

        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND!");

        } catch (NumberFormatException e) {
            System.out.println("INVALID NUMBER IN PRODUCT FILE!\n");

        } catch (IOException e) {
            System.out.println("SOMETHING WENT WRONG!");
        }

        return products;
    }


    public static Product searchByID(int id)
    {
        for (Product p : viewAllProduct())
        {
            //System.out.print("Checking ID: " + p.getID());
            if (p.getID() == id)
            {
                return p;
            }
        }
        return null;
    }

    public static void viewAllProduct(Cart cart) {
    }
}