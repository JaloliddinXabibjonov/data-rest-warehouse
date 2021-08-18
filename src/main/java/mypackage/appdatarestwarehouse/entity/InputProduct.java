package mypackage.appdatarestwarehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import mypackage.appdatarestwarehouse.entity.Product;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Product product;
    @Column(nullable = false)
    private Double amount;
    @Column(nullable = false)
    private Double price;
    @Column(nullable = false)
    private Date expireDate;

    @ManyToOne
    private Input input;

    private boolean active = true;

}
