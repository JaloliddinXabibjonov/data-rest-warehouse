package mypackage.appdatarestwarehouse.repository;

import mypackage.appdatarestwarehouse.entity.Measurement;
import mypackage.appdatarestwarehouse.projection.CustomMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
