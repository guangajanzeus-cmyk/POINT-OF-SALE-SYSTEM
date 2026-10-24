import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        boolean isMainRunning = false;

        while (isMainRunning)
        {
            System.out.println("************************************");
            System.out.println("WELCOME TO POS SYSTEM TERMINAL BASED");
            System.out.println("************************************");
            System.out.println("CHOICES: ");
            System.out.println("1. Product Catalog");
            System.out.println("2. Shopping Cart");
            System.out.println("3. CheckOut and Payment");
            System.out.println("4. Receipt and Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1 -> ProductCatalog();
                case 2 -> System.out.println();
                case 3 -> System.out.println();
                case 4 -> System.out.println();
                case 5 -> isMainRunning = false;
                default -> System.out.println("INVALID CHOICE!");
            }
        }

        scanner.close();
    }
    static String ProductCatalog()
    {


        boolean isProductCatalogRunning = true;

        Product product = new Product();

        while(isProductCatalogRunning)
        {

            System.out.println("**************************");
            System.out.println("WELCOME TO PRODUCT CATALOG");
            System.out.println("**************************");
            System.out.println("1. Display the products");
            System.out.println("2. Search Product by ID");
            System.out.println("3. Exit menu");

            System.out.print("Enter your Choice: ");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1 :
                {
                    ArrayList<Product> products = ProductCatalog.
                }
            }
        }



        return "";
    }
}
