package mypackage.appdatarestwarehouse.projection;

import mypackage.appdatarestwarehouse.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();
    String  getName();
    boolean getActive();
}
