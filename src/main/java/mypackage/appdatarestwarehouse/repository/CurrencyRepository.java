package mypackage.appdatarestwarehouse.repository;

import mypackage.appdatarestwarehouse.entity.Currency;
import mypackage.appdatarestwarehouse.projection.CustomCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}
