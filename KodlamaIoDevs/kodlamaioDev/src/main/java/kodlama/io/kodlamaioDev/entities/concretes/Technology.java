package kodlama.io.kodlamaioDev.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "programming_technologies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "technology_id")
    private int id;

    @Column(name = "technology_name")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "language_id")
    private Language language;
}
