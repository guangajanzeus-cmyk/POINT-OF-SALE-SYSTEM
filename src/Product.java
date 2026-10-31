import java.math.BigDecimal;

public class Product {

    private String viewAllProducts;
    private BigDecimal price;
    private int quantity;
    private int ID;

    public Product(String viewAllProducts, BigDecimal price, int quantity, int ID)
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

    public BigDecimal getviewstockPrice()
    {
        return price;
    }
    public void setviewstockPrice(BigDecimal price)
    {
        this.price = price;
    }

    public int getQuantity()

    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public int getID(){
       return ID;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }


}
