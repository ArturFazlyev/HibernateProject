package auto.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "person", schema = "demo")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "home")
    private HomeAddress homeAddress;

    public Person(String name, HomeAddress homeAddress){
        this.name = name;
        this.homeAddress = homeAddress;
    }
}
