/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.dao.IProductDao;
import com.example.model.Product;
import java.util.List;

/**
 *
 * @author b
 */
public class ProductService implements IProductService {

	private IProductDao dao;

	@Override
	public Product save(Product product) {
		return dao.save(product);
	}

	@Override
	public Product update(Product product) {
		return dao.update(product);
	}

	@Override
	public Product delete(Product product) {
		return dao.delete(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return dao.getAllProducts();
	}

}
