package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbtest", "root", "root");
            if (!connection.isClosed()) {
                System.out.println("Connection established");
            }
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Пупупу");
//            e.printStackTrace();
        }
    }
//    public Connection getConnection() {
//        return connection;
//    }
}
