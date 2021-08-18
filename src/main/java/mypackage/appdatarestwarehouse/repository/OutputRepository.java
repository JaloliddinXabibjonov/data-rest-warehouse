package mypackage.appdatarestwarehouse.repository;

import mypackage.appdatarestwarehouse.entity.Output;
import mypackage.appdatarestwarehouse.projection.CustomOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output", excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
}
