package model;

public class TransactionItem {
    private int productID;
    private String productName;
    private double price;
    private int quantity;
    private double lineTotal;

    public TransactionItem(int productID, String productName, double price, int quantity, double lineTotal) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.lineTotal = lineTotal;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getLineTotal() {
        return lineTotal;
    }
}
