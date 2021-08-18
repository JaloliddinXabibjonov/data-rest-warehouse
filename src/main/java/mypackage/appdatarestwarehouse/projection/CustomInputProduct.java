package mypackage.appdatarestwarehouse.projection;

import mypackage.appdatarestwarehouse.entity.Input;
import mypackage.appdatarestwarehouse.entity.InputProduct;
import mypackage.appdatarestwarehouse.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();
    Double   getAmount();
    Double   getPrice();
    Date     getExpireDate();
    boolean  getActive();
    Product  getProduct();
    Input    getInput();

}
