package camt.cbsd.service;

import camt.cbsd.entity.Product;

import java.util.List;

/**
 * Created by Lenovo on 17-Apr-17.
 */
public interface ProductService {
    Product getProduct(long id);
    List<Product> getProducts();
    Product addProduct(Product product);
}
