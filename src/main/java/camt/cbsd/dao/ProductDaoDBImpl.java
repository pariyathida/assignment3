package camt.cbsd.dao;

import camt.cbsd.entity.Product;
import camt.cbsd.repository.ProductRepository;
import jersey.repackaged.com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lenovo on 17-Apr-17.
 */
@Primary
@Repository
@Profile("DBDataSource")
public class ProductDaoDBImpl implements ProductDao{
    ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(long id) {
        return productRepository.findOne(id);
    }

    @Override
    public List<Product> getProducts() {
        return Lists.newArrayList(productRepository.findAll());
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Integer size() {
        return (int)productRepository.count();
    }
}
