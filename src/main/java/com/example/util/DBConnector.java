package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.example.dao.UserDaoIml;

public class DBConnector {

    public static Connection conn = null;

    public static Connection getConnection() {

        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/cms";
                String user = "root";
                String password = "123456";

                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, password);

                return conn;

            } catch (ClassNotFoundException | SQLException ex) {
                UserDaoIml.lastMsg =ex.getMessage();
            }
        }
        UserDaoIml.lastMsg = "Database Connection Failed";
        return conn;
    }

}
