package mypackage.appdatarestwarehouse.repository;

import mypackage.appdatarestwarehouse.entity.User;
import mypackage.appdatarestwarehouse.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {
}
