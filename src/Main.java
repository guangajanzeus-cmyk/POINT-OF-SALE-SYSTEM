import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        boolean isMainRunning = true;

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
                case 1 -> {
                    ProductCatalog();
                    break;
                }
                case 2 -> System.out.println();
                case 3 -> System.out.println();
                case 4 -> System.out.println();
                case 5 -> isMainRunning = false;
                default -> System.out.println("INVALID CHOICE!");
            }
        }

        scanner.close();
    }
    static void ProductCatalog()
    {


        boolean isProductCatalogRunning = true;

        Product product = new Product();

        while(isProductCatalogRunning)
        {

            System.out.println("**************************");
            System.out.println("WELCOME TO PRODUCT CATALOG");
            System.out.println("**************************");
            System.out.println("1. Display all products");
            System.out.println("2. Search Product by ID");
            System.out.println("3. Exit menu");

            System.out.print("Enter your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1 :
                {
                        ArrayList<Product> products = ProductCatalog.viewAllProduct();
                        if (products.isEmpty()) {
                            System.out.println("INVENTORY IS EMPTY");
                        } else {
                            System.out.print("PRODUCTS FOUND!!!\n");
                            System.out.println();

                            for (Product p : products)
                            {
                                System.out.println("PRODUCT ID: "+p.getID()
                                        +"\n"+"ITEM: "+p.viewProducts()
                                        + "\n" + "PRODUCT PRICE: ₱" + p.getviewstockPrice()
                                        + "\n"
                                        + "QUANTITY: " + p.getQuantity() + "\n");
                            }
                        }
                        break;

                }
                case 2 :
                {

                    System.out.print("INPUT THE ID: ");
                    int ID = scanner.nextInt();

                    Product SearchID = ProductCatalog.searchByID(ID);

                    if (SearchID == null)
                    {
                        System.out.println("PRODUCT NOT FOUND, TRY AGAIN");
                    }
                    else
                    {
                        System.out.println();
                        System.out.println("ID FOUND!");
                        System.out.println();

                            System.out.println("PRODUCT ID: " + SearchID.getID() + "\n" +
                                    "ITEM: " + SearchID.viewProducts() +
                                    "\n" + "PRODUCT PRICE : ₱" + SearchID.getviewstockPrice() + "\n" +
                                    "PRODUCT QUANTITY: " + SearchID.getQuantity() + "\n"
                            );
                    }
                    break;


                }
                case 3 : isProductCatalogRunning = false;
            }
        }


    }
}
