package camt.cbsd.service;

import camt.cbsd.dao.ProductDao;
import camt.cbsd.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lenovo on 17-Apr-17.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;

    @Override
    public Product getProduct(long id) {
        return productDao.getProduct(id);
    }

    @Override
    public List<Product> getProducts() {
        return productDao.getProducts();
    }

    @Override
    public Product addProduct(Product product) {
        return productDao.addProduct(product);
    }
}
