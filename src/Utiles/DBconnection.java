package Utiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static String user = "root";
    private static String password = "";
    private static String url = "jdbc:mysql://localhost:3306/GestionApp";

    public static Connection connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            return null;
        }

        try {
            return DriverManager.getConnection(url, user, password);


        } catch (SQLException throwables) {
            return null;
        }


    }


}
