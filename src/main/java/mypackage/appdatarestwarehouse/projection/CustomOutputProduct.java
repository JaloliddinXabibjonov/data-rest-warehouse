package mypackage.appdatarestwarehouse.projection;

import mypackage.appdatarestwarehouse.entity.Output;
import mypackage.appdatarestwarehouse.entity.OutputProduct;
import mypackage.appdatarestwarehouse.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
    Double  getAmount();
    Double  getPrice();
    Product getProduct();
    Output  getOutput();
}
