package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Transaction {
    private int transactionID;
    private String customerName;
    private LocalDateTime transactionDate;
    private ArrayList<TransactionItem> items;
    private double subtotal;
    private double tax;
    private double total;
    private double amountPaid;
    private double change;

    public Transaction(int transactionID, String customerName, ArrayList<TransactionItem> items, double subtotal, double tax, double total, double amountPaid, double change) {
        this.transactionID = transactionID;
        this.customerName = customerName;
        this.transactionDate = LocalDateTime.now();
        this.items = items;
        this.subtotal = subtotal;
        this.tax = tax;
        this.total = total;
        this.amountPaid = amountPaid;
        this.change = change;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getTransactionDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return transactionDate.format(formatter);
    }

    public ArrayList<TransactionItem> getItems() {
        return items;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTax() {
        return tax;
    }

    public double getTotal() {
        return total;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public double getChange() {
        return change;
    }
}
