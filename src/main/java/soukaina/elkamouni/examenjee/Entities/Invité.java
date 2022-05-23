package soukaina.elkamouni.examenjee.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data @DiscriminatorValue("INVITE")
@AllArgsConstructor
@NoArgsConstructor
public class Invité extends Participant {
    private String affiliation;
    @OneToMany(mappedBy = "invité",fetch = FetchType.LAZY)
    private List<Inscription> inscriptionList;
}
