package mypackage.appdatarestwarehouse.repository;

import mypackage.appdatarestwarehouse.entity.Product;
import mypackage.appdatarestwarehouse.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
