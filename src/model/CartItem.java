package model;

public class CartItem{
    private Product product;
    private int cartQuantity;
    private String viewAllCartItem;
    public CartItem(Product addProduct, int cartQuantity)
    {
        this.product = addProduct;
        this.cartQuantity = cartQuantity;
    }

    public void setAddProduct(Product addProduct)
    {
        this.product = addProduct;
    }
    public Product getAddProduct()
    {
        return product;
    }
    public void setCartQuantity(int cartQuantity)
    {
        this.cartQuantity = cartQuantity;
    }
    public int getCartQuantity()
    {
        return this.cartQuantity;
    }
    public String ViewAllCartItem()
    {
        return ViewAllCartItem();
    }
}

