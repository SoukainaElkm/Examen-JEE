package soukaina.elkamouni.examenjee.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soukaina.elkamouni.examenjee.Entities.Participant;

@Repository
public interface participantRepository extends JpaRepository<Participant, Long> {
}
