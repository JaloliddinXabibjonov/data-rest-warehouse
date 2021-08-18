package mypackage.appdatarestwarehouse.repository;

import mypackage.appdatarestwarehouse.entity.InputProduct;
import mypackage.appdatarestwarehouse.projection.CustomInputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputProduct", excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {
}
