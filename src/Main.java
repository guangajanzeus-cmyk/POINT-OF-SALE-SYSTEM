import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        boolean isMainMenuRunning = true;

        while (isMainMenuRunning) {

            System.out.println("===========Computer Shop & Printing Station Hybrid POS System===========");
            System.out.println("1. Product Catalog");
            System.out.println("2. Shopping Cart");
            System.out.println("3. Checkout");
            System.out.println("5. Exit");
            System.out.println("4. Transaction");
            System.out.print("Choose an Option: ");
            int mainChoice = scanner.nextInt();

            switch (mainChoice)
            {
                case 1 -> ProductCatalog();
                case 2 -> System.out.println("2nd method");
                case 3 -> System.out.println("3rd method");
                case 4 -> System.out.println("4th method");
                case 5 -> isMainMenuRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }

        }

    }
    static String ProductCatalog()
    {

        Product product = new Product();

        try (BufferedReader reader = new BufferedReader(new FileReader(product.ProductListPath)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                product.products.add(line.trim());
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not FOUND!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        return "";
    }
}
