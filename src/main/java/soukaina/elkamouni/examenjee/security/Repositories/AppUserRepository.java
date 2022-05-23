package soukaina.elkamouni.examenjee.security.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soukaina.elkamouni.examenjee.security.Entities.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,String> {
    AppUser findByUsername(String username);
}
