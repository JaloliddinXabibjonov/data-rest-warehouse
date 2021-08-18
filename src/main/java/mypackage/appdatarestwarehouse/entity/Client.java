package mypackage.appdatarestwarehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import mypackage.appdatarestwarehouse.entity.template.AbsEntity;


import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client extends AbsEntity {

    @Column(nullable = false, unique = true)
    private String phoneNumber;
}
