package com.example.dao;

import com.example.model.Product;
import com.example.util.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements IProductDao {

    Connection conn = DBConnector.getConnection();
    public static String lastMsg = "";

    @Override
    public Product save(Product product) {

        try {
            String sql = "insert into products(name,price,quantity,remarks) values(?,?,?,?)";

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, product.getName());
            pst.setDouble(2, product.getPrice());
            pst.setInt(3, product.getQuantity());
            pst.setString(4, product.getRemarks());
            if (pst.executeUpdate() > 0) {
                lastMsg = "Product saved !";
                return product;
            }

        } catch (SQLException ex) {
            lastMsg = ex.getMessage();
        }
        return null;
    }

    @Override
    public Product update(Product product) {

        try {
            String sql = "update products set name = ?,set price = ?,set quantity = ?,set remarks = ? where id = ?";

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, product.getName());
            pst.setDouble(2, product.getPrice());
            pst.setInt(3, product.getQuantity());
            pst.setString(4, product.getRemarks());
            pst.setLong(5, product.getId());

            if (pst.executeUpdate() > 0) {
                lastMsg = "Product updated !";
                return product;
            }

        } catch (SQLException ex) {
            lastMsg = ex.getMessage();
        }
        return null;
    }

    @Override
    public Product delete(Product product) {

        try {
            String sql = "delete from products where id = ?";

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setLong(1, product.getId());

            if (pst.executeUpdate() > 0) {
                lastMsg = "Product deleted !";
                return product;
            }

        } catch (SQLException ex) {
            lastMsg = ex.getMessage();
        }
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "select * from products";

            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(
                        new Product(
                                rs.getLong("id"),
                                rs.getString("name"),
                                rs.getDouble("price"),
                                rs.getInt("quantity"),
                                rs.getString("remarks"))
                );
            }
            
            return list;
            

        } catch (SQLException ex) {
            lastMsg = ex.getMessage();
        }
        return null;
    }

}
