package mypackage.appdatarestwarehouse.repository;

import mypackage.appdatarestwarehouse.entity.Warehouse;
import mypackage.appdatarestwarehouse.projection.CustomWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

}
