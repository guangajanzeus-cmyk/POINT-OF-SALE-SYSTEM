import java.util.ArrayList;
import java.util.Random;

public class ProductCatalog {
    String ProductListPath = "C:\\Users\\DELL\\IdeaProjects\\POINT-OF-SALE SYSTEM\\src\\POS ITEM LIST product FILE\\PRODUCT CATALOG LIST ITEM.txt";

    static ArrayList<String> products = new ArrayList<>();
    private static Random random = new Random();

    public static void addProduct (Product product)
    {
        int id = 100000 + random.nextInt(900000);
        product.setID(id);
        products.add(product);
        System.out.println("Saved with ID: " + id);
    }


}
