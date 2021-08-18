package mypackage.appdatarestwarehouse.projection;

import mypackage.appdatarestwarehouse.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
    String  getName();
    boolean getActive();
    String  getPhoneNumber();
}
