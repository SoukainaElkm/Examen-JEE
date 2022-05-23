package soukaina.elkamouni.examenjee.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import soukaina.elkamouni.examenjee.Entities.Commentaire;

public interface commentaireRepository extends JpaRepository<Commentaire, Long> {
}
