package util;

import model.Transaction;
import model.TransactionItem;

public class Receipt {

    public static void printReceipt(Transaction transaction) {
        System.out.println();
        System.out.println("========================================");
        System.out.println("           POS SYSTEM RECEIPT           ");
        System.out.println("========================================");
        System.out.println("Transaction ID:  #" + transaction.getTransactionID());
        System.out.println("Date:            " + transaction.getTransactionDate());
        System.out.println("Customer:        " + transaction.getCustomerName());
        System.out.println("========================================");
        System.out.println("ITEMS PURCHASED:");
        System.out.println("----------------------------------------");
        System.out.println("ID    NAME            PRICE     QTY     TOTAL");
        System.out.println("----------------------------------------");

        for (TransactionItem item : transaction.getItems()) {
            System.out.printf("%-5d  %-13s  %-7.2f  %-5d  %.2f%n",
                    item.getProductID(),
                    item.getProductName(),
                    item.getPrice(),
                    item.getQuantity(),
                    item.getLineTotal()
            );
        }

        System.out.println("----------------------------------------");
        System.out.printf("Subtotal:        %.2f%n", transaction.getSubtotal());
        System.out.printf("Tax (12%%):       %.2f%n", transaction.getTax());
        System.out.println("----------------------------------------");
        System.out.printf("TOTAL:           %.2f%n", transaction.getTotal());
        System.out.printf("Amount Paid:     %.2f%n", transaction.getAmountPaid());
        System.out.printf("Change:          %.2f%n", transaction.getChange());
        System.out.println("========================================");
        System.out.println("        Thank you for your purchase!    ");
        System.out.println("========================================");
        System.out.println();
    }
}
