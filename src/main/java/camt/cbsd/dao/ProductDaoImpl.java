package camt.cbsd.dao;

import camt.cbsd.entity.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Lenovo on 17-Apr-17.
 */
@Repository
public class ProductDaoImpl implements ProductDao{
    List<Product> products;
    String baseUrl;
    String imageUrl;

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    String imageBaseUrl;

    @PostConstruct
    private void init(){


    }

    @Override
    public Product getProduct(long id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Product addProduct(Product product){
        int newId = this.size()+1;
        product.setId(newId);
        products.add(product);
        return product;
    }

    public Integer size(){
        return products.size();
    }
}
