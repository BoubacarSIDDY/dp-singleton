package sn.isi.database;

public class SingletonConnection {
    private static Connection connection;
    private SingletonConnection(){}

    public static Connection getConnection(){
        if (connection == null){
            connection = new Connection();
        }
        return connection;
    }
}
