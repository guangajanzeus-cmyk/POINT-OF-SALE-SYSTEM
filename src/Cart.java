import java.math.BigDecimal;
import java.util.ArrayList;
import model.Product;
import model.CartItem;

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

    public BigDecimal calculateTotalPrice() {
        BigDecimal total = BigDecimal.ZERO;

        for (CartItem item : cartItems) {
            BigDecimal price = item.getAddProduct().getviewstockPrice();
            int quantity = item.getCartQuantity();

            total = total.add(price.multiply(BigDecimal.valueOf(quantity)));
        }

        return total;
    }

    public void clearCart() {
        cartItems.clear();
    }

    public int calculateTotalQuantity() {
        int totalQuantity = 0;

        for (CartItem item : cartItems) {
            totalQuantity += item.getCartQuantity();
        }

        return totalQuantity;
    }

}
