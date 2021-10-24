 
package com.example.dao;

import com.example.model.Product;
import java.util.List;
 
public interface IProductDao {
  public Product save(Product product);
  public Product update(Product product);
  public Product delete(Product product);
  public List<Product> getAllProducts();
 
}
