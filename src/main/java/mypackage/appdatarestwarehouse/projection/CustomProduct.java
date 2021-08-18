package mypackage.appdatarestwarehouse.projection;

import mypackage.appdatarestwarehouse.entity.Category;
import mypackage.appdatarestwarehouse.entity.Measurement;
import mypackage.appdatarestwarehouse.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer     getId();
    String getName();
    Measurement getMeasurement();
    Category    getCategory();
    String      getCode();
}
