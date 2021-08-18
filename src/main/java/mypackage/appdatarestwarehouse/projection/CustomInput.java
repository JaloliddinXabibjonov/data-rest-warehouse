package mypackage.appdatarestwarehouse.projection;

import mypackage.appdatarestwarehouse.entity.Currency;
import mypackage.appdatarestwarehouse.entity.Input;
import mypackage.appdatarestwarehouse.entity.Supplier;
import mypackage.appdatarestwarehouse.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getCode();

}
