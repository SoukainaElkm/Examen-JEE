package soukaina.elkamouni.examenjee.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soukaina.elkamouni.examenjee.Entities.Session;

@Repository
public interface sessionRepository extends JpaRepository<Session, String> {
}
