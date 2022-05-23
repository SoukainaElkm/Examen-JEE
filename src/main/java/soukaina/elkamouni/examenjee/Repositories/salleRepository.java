package soukaina.elkamouni.examenjee.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soukaina.elkamouni.examenjee.Entities.Salle;

@Repository
public interface salleRepository extends JpaRepository<Salle, Long> {
}
