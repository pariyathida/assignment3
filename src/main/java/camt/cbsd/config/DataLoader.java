package camt.cbsd.config;

/**
 * Created by Lenovo on 17-Apr-17.
 */

import camt.cbsd.dao.ProductDao;
import camt.cbsd.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix="server")
@Component
public class DataLoader implements ApplicationRunner {
    ProductDao productDao;

    @Autowired
    public void setProductDao(ProductDao productDao){
        this.productDao = productDao;
    }
    String baseUrl;
    String imageUrl;
    String imageBaseUrl;
    public void setBaseUrl (String baseUrl){
        this.baseUrl = baseUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception{
        productDao.addProduct(Product.builder().name("Canon EOS M10").description("Mirrorless camera").pictures("eosm10.jpg").price(13890).amount(10).rating(8.25).build());
        productDao.addProduct(Product.builder().name("Fujifilm XA3").description("Mirrorless camera").pictures("xa3.jpg").price(23190).amount(10).rating(8.00).build());
    }
}
