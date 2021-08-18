package mypackage.appdatarestwarehouse.repository;

import mypackage.appdatarestwarehouse.entity.Input;
import mypackage.appdatarestwarehouse.projection.CustomInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input", excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
}
