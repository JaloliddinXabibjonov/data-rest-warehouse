package mypackage.appdatarestwarehouse.projection;

import mypackage.appdatarestwarehouse.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
    String getName();
    boolean getActive();
    String getPhoneNumber();

}
