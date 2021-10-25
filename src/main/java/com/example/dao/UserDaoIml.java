package com.example.dao;

import com.example.util.DBConnector;
import com.example.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.example.dao.IUserDao;

public class UserDaoIml implements IUserDao {

    Connection conn = DBConnector.getConnection();
    public static String lastMsg = "";

    @Override
    public User save(User user) {

        try {
            String sql = "insert into users(fullname,username,password) values(?,?,?)";

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, user.getFullname());
            pst.setString(2, user.getUsername());
            pst.setString(3, user.getPassword());

            if (pst.executeUpdate() > 0) {
                return user;
            }

        } catch (SQLException ex) {
            lastMsg = ex.getMessage();
        }
        return null;
    }
    @Override
    public User getUser(String username) {
        try {
            String sql = "select * from users where username = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                User user = new User(
                        rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("username"),
                        rs.getString("password")
                );
                return user;

            }

        } catch (SQLException ex) {
            lastMsg = ex.getMessage();
        }
        return null;
    }

    @Override
    public Boolean update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
