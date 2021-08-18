package mypackage.appdatarestwarehouse.repository;

import mypackage.appdatarestwarehouse.entity.Client;
import mypackage.appdatarestwarehouse.projection.CustomClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
