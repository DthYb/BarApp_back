package com.example.barapp.tools;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConfig {
    private static final String URL = "jdbc:mysql://localhost:3306/BarApp";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() throws SQLException {
        try{
            Class.forName(DRIVER);
        }catch (ClassNotFoundException e){
            throw new SQLException("Driver non trouvé", e);
        }
        return DriverManager.getConnection(URL,USER, PASSWORD);
    }
}
