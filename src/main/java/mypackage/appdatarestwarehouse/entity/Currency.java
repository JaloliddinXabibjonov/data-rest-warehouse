package mypackage.appdatarestwarehouse.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mypackage.appdatarestwarehouse.entity.template.AbsEntity;


import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Currency extends AbsEntity {
}
