package soukaina.elkamouni.examenjee.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soukaina.elkamouni.examenjee.Entities.Conférence;

@Repository
public interface conférenceRepository extends JpaRepository<Conférence,String> {
}
