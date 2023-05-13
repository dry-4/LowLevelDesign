package org.example.DesignPatterns.Singleton.SingleThreaded;

public class Client {
    public static void main(String args[]) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();

        // Address is going to be same as db1
        DatabaseConnection db2 = DatabaseConnection.getInstance();

    }
}
