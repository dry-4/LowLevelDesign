package org.example.DesignPatterns.Singleton.DoubleCheckLocking;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        if (databaseConnection == null) {      // T1, T2 First check without a lock
            synchronized (DatabaseConnection.class) {       // T1, T2
                if (databaseConnection == null) {      // Second check after a lock
                    databaseConnection = new DatabaseConnection();
                }
            }
        }

        return databaseConnection;
    }

}
