import java.math.BigDecimal;

public class Product {

    private String viewAllProducts;
    private BigDecimal price;
    private int quantity;
    private String ID;

    public Product(String viewAllProducts, BigDecimal price, int quantity, String ID)
    {
        this.viewAllProducts = viewAllProducts;
        this.price = price;
        this.quantity = quantity;
        this.ID = ID;
    }
    Product()
    {

    }

    public String viewProducts()
    {
        return this.viewAllProducts;
    }


}
