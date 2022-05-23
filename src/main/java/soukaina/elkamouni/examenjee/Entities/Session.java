package soukaina.elkamouni.examenjee.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Session {
    @Id
    private String id;
    private String nom;
    @OneToMany(mappedBy = "session",fetch = FetchType.LAZY)
    private List<Conférence> conférences;
    @ManyToOne
    private Modérateur modérateur;
    @OneToMany(mappedBy = "session",fetch = FetchType.LAZY)
    private List<Inscription> inscriptionList;
}
