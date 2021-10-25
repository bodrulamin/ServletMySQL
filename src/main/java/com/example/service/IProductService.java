/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.model.Product;
import java.util.List;

/**
 *
 * @author b
 */
public interface IProductService {

	public Product save(Product product);

	public Product update(Product product);

	public Product delete(Product product);

	public List<Product> getAllProducts();

}
