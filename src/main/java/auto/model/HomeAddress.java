package auto.model;


import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "homeaddress", schema = "demo")
public class HomeAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    public HomeAddress(String city, String street){
        this.city = city;
        this.street = street;
    }
}
