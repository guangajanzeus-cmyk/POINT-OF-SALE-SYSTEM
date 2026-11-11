import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import model.Product;
import model.CartItem;
import model.Transaction;
import model.TransactionItem;
import service.ProductCatalog;
import service.TransactionHistory;
import util.Receipt;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    static boolean isMainRunning = true;
    static Cart cart = new Cart();

    public static void main(String[] args)
    {


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
                case 2 -> {
                    ShoppingCart();
                    break;
                }
                case 3 -> {
                    CheckOut();
                    break;
                }
                case 4 -> {
                    ReceiptHistory();
                    break;
                }
                case 5 -> {
                    isMainRunning = false;
                    break;
                }
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
            System.out.println("4. Exit the Program");

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
                        }
                        else {
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
                case 3 : {isProductCatalogRunning = false;
                break;
                }
                case 4 : {
                    isProductCatalogRunning = false;
                    isMainRunning = false;
                }
                default:
                    System.out.println("INVALID CHOICE");
            }
        }


    }
    static void ShoppingCart()
    {

        boolean isShoppingCartRunning = true;

        while (isShoppingCartRunning)
        {
            System.out.println("*****Welcome to Shopping Cart*****");
            System.out.println("1. Add a Product to your shopping Cart by ID");
            System.out.println("2. Remove Product from your Shopping Cart");
            System.out.println("3. Check Price of the Product by ID");
            System.out.println("4. Exit the Menu");
            System.out.println("5. Exit the Program");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();



            switch (choice)
            {
                case 1 :
                {
                    System.out.print("Enter the ID of the product you want to add in the cart: ");
                    int addProduct = scanner.nextInt();
                    System.out.print("Enter how many product you want to buy: ");
                    int addQuantityItem = scanner.nextInt();

                    Product selectedProduct = ProductCatalog.searchByID(addProduct);

                    if (selectedProduct != null) {

                        cart.addItem(selectedProduct, addQuantityItem);

                        System.out.println("\nProduct add Succesfully!");
                        System.out.println();

                        System.out.println("PRODUCT ID: " + selectedProduct.getID() + "\n" +
                                "ITEM: " + selectedProduct.viewProducts() +
                                "\n" + "PRODUCT PRICE : ₱" + selectedProduct.getviewstockPrice() + "\n");
                    }
                    else {
                        System.out.println("Product not found");
                    }
                    break;

                }
                case 2 :
                {
                    System.out.print("Enter the ID of the product you want to remove: ");
                    int removeProduct = scanner.nextInt();

                    cart.removeItem(removeProduct);
                    break;
                }
                case 3:
                {
                    System.out.print("Enter the ID: ");
                    int checkPrice = scanner.nextInt();


                    Product searchID = ProductCatalog.searchByID(checkPrice);

                    if (searchID != null)
                    {
                        System.out.println();
                        System.out.println("PRODUCT FOUND!");
                        System.out.println("Item: " + searchID.viewProducts() + "\n"
                        + "Price: " + searchID.getviewstockPrice());
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Product not found!");
                    }
                    break;

                }
                case 4 :
                {
                    isShoppingCartRunning = false;
                    break;
                }
                case 5 :
                {
                    isMainRunning = false;
                    isShoppingCartRunning = false;
                    break;
                }
                default:
                    System.out.println("INVALID CHOICE!");
            }
        }
    }
    static void CheckOut()
    {
        boolean isCheckOutRunning = true;

        while (isCheckOutRunning)
        {
            System.out.println("*****Ready to Checkout******");
            System.out.println("1. Display all Cart items");
            System.out.println("2. Checkout and Payment");
            System.out.println("3. Exit the Menu");
            System.out.println("4. Exit the Program");

            System.out.print("Enter your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1 :
                {
                    ArrayList<CartItem> cartItems = cart.viewAllCartItems();
                    if (cartItems.isEmpty()) {
                        System.out.println("Cart Item not Found!");
                    }
                    else
                    {
                        System.out.println("*****YOUR SHOPPING CART*****");

                        for (CartItem c : cartItems) {

                            Product product = c.getAddProduct();

                            System.out.println("PRODUCT ID: " + product.getID());
                            System.out.println("ITEM: " + product.viewProducts());
                            System.out.println("PRICE: ₱" + product.getviewstockPrice());
                            System.out.println("QUANTITY: " + c.getCartQuantity());

                            System.out.println("----------------------------------------");
                        }
                    }
                    break;

                }
                case 2 :
                {
                    ArrayList<CartItem> cartItem = cart.viewAllCartItems();

                    if (cartItem.isEmpty())
                    {
                        System.out.println("YOUR CART IS EMPTY, CAN'T PROCEED TO CHECKOUT!");
                    }
                    else
                    {
                        System.out.print("Enter your Name: ");
                        String userName = scanner.nextLine();
                        System.out.print("Enter your Money: ");
                        double userMoney = scanner.nextDouble();

                        double subtotal = 0;
                        ArrayList<TransactionItem> transactionItems = new ArrayList<>();
                        for (CartItem ci : cartItem) {
                            Product p = ci.getAddProduct();
                            double itemTotal = p.getviewstockPrice().doubleValue() * ci.getCartQuantity();
                            subtotal += itemTotal;
                            TransactionItem ti = new TransactionItem(
                                    p.getID(),
                                    p.viewProducts(),
                                    p.getviewstockPrice().doubleValue(),
                                    ci.getCartQuantity(),
                                    itemTotal
                            );
                            transactionItems.add(ti);
                        }
                        double tax = subtotal * 0.12;
                        double total = subtotal + tax;
                        if (userMoney = total) {
                            double change = userMoney - total;
                            int transID = TransactionHistory.getNextTransactionID();
                            Transaction transaction = new Transaction(
                                    transID,
                                    userName,
                                    transactionItems,
                                    subtotal,
                                    tax,
                                    total,
                                    userMoney,
                                    change
                            );
                            TransactionHistory.addTransaction(transaction);
                            Receipt.printReceipt(transaction);
                            cart.clearCart();
                        } else {
                            double remaining = total - userMoney;
                            System.out.println();
                            System.out.println("========================================");
                            System.out.println("        INSUFFICIENT FUNDS              ");
                            System.out.println("========================================");
                            System.out.printf("Total Required:    %.2f%n", total);
                            System.out.printf("Amount Given:      %.2f%n", userMoney);
                            System.out.printf("Shortfall:         %.2f%n", remaining);
                            System.out.println("========================================");
                            System.out.println();
                        }
                    }
                    break;

                }
                case 3 :
                {
                    isCheckOutRunning = false;
                    break;
                }
                case 4 :
                {
                    isMainRunning = false;
                    isCheckOutRunning = false;
                    break;
                }
            }
        }
    }
    static void ReceiptHistory()
    {
        boolean isReceiptHistoryRunning = true;

        while (isReceiptHistoryRunning)
        {
            System.out.println("**************************************");
            System.out.println(" RECEIPT & TRANSACTION HISTORY");
            System.out.println("**************************************");
            System.out.println("1. View all transactions");
            System.out.println("2. View transaction by ID");
            System.out.println("3. Re-print receipt");
            System.out.println("4. Exit menu");
            System.out.println("5. Exit program");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1 :
                {
                    ArrayList<Transaction> allTransactions = TransactionHistory.getAllTransactions();
                    if (allTransactions.isEmpty()) {
                        System.out.println("No transactions found!");
                    } else {
                        System.out.println("TOTAL TRANSACTIONS: " + TransactionHistory.getTransactionCount());
                        System.out.println();
                        for (Transaction t : allTransactions) {
                            System.out.println("Transaction ID: #" + t.getTransactionID());
                            System.out.println("Date: " + t.getTransactionDate());
                            System.out.println("Customer: " + t.getCustomerName());
                            System.out.println("Total: ₱" + t.getTotal());
                            System.out.println("----------------------------------------");
                        }
                    }
                    break;
                }
                case 2 :
                {
                    System.out.print("Enter Transaction ID: ");
                    int searchID = scanner.nextInt();
                    Transaction found = TransactionHistory.getTransactionByID(searchID);
                    if (found == null) {
                        System.out.println("Transaction not found!");
                    } else {
                        System.out.println();
                        System.out.println("Transaction ID: #" + found.getTransactionID());
                        System.out.println("Date: " + found.getTransactionDate());
                        System.out.println("Customer: " + found.getCustomerName());
                        System.out.println("Subtotal: ₱" + found.getSubtotal());
                        System.out.println("Tax: ₱" + found.getTax());
                        System.out.println("Total: ₱" + found.getTotal());
                        System.out.println("Amount Paid: ₱" + found.getAmountPaid());
                        System.out.println("Change: ₱" + found.getChange());
                        System.out.println();
                        System.out.println("Items:");
                        for (TransactionItem item : found.getItems()) {
                            System.out.println("  " + item.getProductName() + " x" + item.getQuantity() + " = ₱" + item.getLineTotal());
                        }
                    }
                    break;
                }
                case 3 :
                {
                    System.out.print("Enter Transaction ID to re-print: ");
                    int reprintID = scanner.nextInt();
                    Transaction found = TransactionHistory.getTransactionByID(reprintID);
                    if (found == null) {
                        System.out.println("Transaction not found!");
                    } else {
                        Receipt.printReceipt(found);
                    }
                    break;
                }
                case 4 :
                {
                    isReceiptHistoryRunning = false;
                    break;
                }
                case 5 :
                {
                    isMainRunning = false;
                    isReceiptHistoryRunning = false;
                    break;
                }
                default:
                    System.out.println("INVALID CHOICE!");
            }
        }
    }
}
