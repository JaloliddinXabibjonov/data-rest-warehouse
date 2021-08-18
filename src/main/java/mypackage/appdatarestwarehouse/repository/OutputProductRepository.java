package mypackage.appdatarestwarehouse.repository;

import mypackage.appdatarestwarehouse.entity.OutputProduct;
import mypackage.appdatarestwarehouse.projection.CustomOutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
