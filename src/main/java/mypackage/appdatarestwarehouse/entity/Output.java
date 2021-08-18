package mypackage.appdatarestwarehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Timestamp date;

    @ManyToOne
    private Warehouse warehouse;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Currency currency;
    @Column(unique = true, nullable = false)
    private String code= UUID.randomUUID().toString();

}
