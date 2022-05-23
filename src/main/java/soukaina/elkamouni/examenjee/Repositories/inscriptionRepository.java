package soukaina.elkamouni.examenjee.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import soukaina.elkamouni.examenjee.Entities.Inscription;

public interface inscriptionRepository extends JpaRepository<Inscription,Long> {
}
