package mypackage.appdatarestwarehouse.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mypackage.appdatarestwarehouse.entity.template.AbsEntity;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Objects;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends AbsEntity {

    @Column(unique = true, nullable = false)
    String code= UUID.randomUUID().toString();

    @ManyToOne
    Measurement measurement;

    @ManyToOne
    Category category;

    public Product(Integer id, String name, boolean active, Category category, Measurement measurement) {
        super(id, name, active);
        this.category = category;
        this.measurement = measurement;
    }

    public Product(Category category, Measurement measurement) {
        this.category = category;
        this.measurement = measurement;
    }
}
