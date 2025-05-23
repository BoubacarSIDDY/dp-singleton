package sn.isi;

import sn.isi.database.Connection;
import sn.isi.database.SingletonConnection;

public class Application {
    public static void main(String[] args) {
        Connection dbConnection = SingletonConnection.getConnection();
        Connection dbConnection1 = SingletonConnection.getConnection();
        Connection dbConnection2 = SingletonConnection.getConnection();
        System.out.println("--- Hash code ----");
        System.out.println(dbConnection.hashCode());
        System.out.println(dbConnection1.hashCode());
        System.out.println(dbConnection2.hashCode());
    }
}