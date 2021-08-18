package mypackage.appdatarestwarehouse.repository;

import mypackage.appdatarestwarehouse.entity.Category;
import mypackage.appdatarestwarehouse.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
