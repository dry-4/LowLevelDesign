package lld.designpatterns.singleton.eagerLoading;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();

        // Address should be same as db1
        DatabaseConnection db2 = DatabaseConnection.getInstance();
    }
}
