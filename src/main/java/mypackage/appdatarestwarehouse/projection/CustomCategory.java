package mypackage.appdatarestwarehouse.projection;

import mypackage.appdatarestwarehouse.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getName();
    boolean getActive();
    Category getParentCategory();
}
