package camt.cbsd.config;

import camt.cbsd.controller.ProductController;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Lenovo on 17-Apr-17.
 */

@Configuration
public class JerseyConfig extends ResourceConfig{
    public JerseyConfig(){
        register(ProductController.class);
        register(MultiPartFeature.class);
    }
}
