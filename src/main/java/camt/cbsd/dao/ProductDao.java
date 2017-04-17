package camt.cbsd.dao;

import camt.cbsd.entity.Product;

import java.util.List;

/**
 * Created by Lenovo on 17-Apr-17.
 */
public interface ProductDao {
    Product getProduct(long id);
    List<Product> getProducts();
    Product addProduct(Product product);
    Integer size();
}
