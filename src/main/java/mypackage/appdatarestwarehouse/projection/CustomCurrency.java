package mypackage.appdatarestwarehouse.projection;

import mypackage.appdatarestwarehouse.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types= Currency.class)
public interface CustomCurrency {
    Integer getId();
    String getName();
    boolean getActive();
}
