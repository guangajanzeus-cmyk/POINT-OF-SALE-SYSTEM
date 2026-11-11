package service;

import java.util.ArrayList;
import model.Transaction;

public class TransactionHistory {
    private static ArrayList<Transaction> transactions = new ArrayList<>();
    private static int nextTransactionID = 1;

    public static int getNextTransactionID() {
        return nextTransactionID++;
    }

    public static void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public static ArrayList<Transaction> getAllTransactions() {
        return transactions;
    }

    public static Transaction getTransactionByID(int id) {
        for (Transaction t : transactions) {
            if (t.getTransactionID() == id) {
                return t;
            }
        }
        return null;
    }

    public static int getTransactionCount() {
        return transactions.size();
    }

    public static void clearHistory() {
        transactions.clear();
        nextTransactionID = 1;
    }
}
