import java.util.ArrayList;

public class Cart {
    private static ArrayList<CartItem> cartItems = new ArrayList<>();

    public static ArrayList<CartItem> viewAllCartItems(){
        return cartItems;
    }

    public Cart() {
    }
    public void addItem(Product product, int quantity)
    {
        CartItem item = new CartItem(product, quantity);
        cartItems.add(item);
    }
    public void removeItem(int productID)
    {

        for (CartItem item : cartItems )
        {
            Product product = item.getAddProduct();

            if (product.getID() == productID)
            {
                cartItems.remove(item);
                System.out.println("Product remove successfully!!");
                return;
            }
        }

        System.out.println("Product not found!!");

    }

}
