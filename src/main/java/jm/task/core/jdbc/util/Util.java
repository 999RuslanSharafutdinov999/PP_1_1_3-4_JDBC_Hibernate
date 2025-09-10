package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    public static final String URL = "jdbc:mysql://localhost:3306/usersBase";
    public static final String USER = "Ruslan";
    public static final String PASSWORD = "Amplified8908.";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected OK");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection Error");
        }
        return conn;
    }
}


