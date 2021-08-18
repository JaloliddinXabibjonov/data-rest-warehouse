package mypackage.appdatarestwarehouse.repository;

import mypackage.appdatarestwarehouse.entity.Supplier;
import mypackage.appdatarestwarehouse.projection.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
