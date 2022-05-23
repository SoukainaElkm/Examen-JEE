package soukaina.elkamouni.examenjee.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import soukaina.elkamouni.examenjee.Enums.participantGenre;

import javax.persistence.*;
import java.util.List;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", length = 10)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private String photo;
    @Enumerated(EnumType.STRING)
    private participantGenre genre;
    @ManyToMany
    private List<Conférence> conférenceList;
}
