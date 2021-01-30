package auto.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "demo.autos")
@NoArgsConstructor
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "model")
    private String model;

    //можно не указывать Column name, если оно совпадает с названием столбца в таблице
    private String color;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    public Auto (String model, String color) {
        this.model = model;
        this.color = color;
    }



    @Override
    public String toString() {
        return color + " " + model;
    }
}


