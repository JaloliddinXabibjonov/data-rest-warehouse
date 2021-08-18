package mypackage.appdatarestwarehouse.projection;

import mypackage.appdatarestwarehouse.entity.Client;
import mypackage.appdatarestwarehouse.entity.Currency;
import mypackage.appdatarestwarehouse.entity.Output;
import mypackage.appdatarestwarehouse.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer   getId();
    Timestamp getDate();
    String    getCode();
    Warehouse getWarehouse();
    Client    getClient();
    Currency  getCurrency();

}
