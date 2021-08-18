package mypackage.appdatarestwarehouse.projection;

import mypackage.appdatarestwarehouse.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();
    String getName();
    boolean getActive();
}
