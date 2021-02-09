package book.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "author", schema = "public")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    Long id;

    @Column(name = "FIRST_NAME", nullable = false)
    String firstName;

    @Column(name = "SECOND_NAME", nullable = false)
    String secondName;

    @OneToOne
    @JoinColumn(name = "BOOK_ID", unique = true, nullable = false)
    Book book;

}
