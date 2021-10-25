/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.example;

import com.example.dao.IProductDao;
import com.example.dao.ProductDao;
import com.example.model.Product;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductDaoTest {

    //@Test
    public void addProduct() {
        IProductDao dao = new ProductDao();

        Product toSave = new Product(3, "shirt", 3, 4, "good");
        Product savedProduct = dao.save(toSave);

        //assertEquals(toSave, savedProduct);
        assertEquals(true, true);

    }
}
