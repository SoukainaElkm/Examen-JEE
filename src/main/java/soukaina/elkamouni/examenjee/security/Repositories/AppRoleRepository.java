package soukaina.elkamouni.examenjee.security.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import soukaina.elkamouni.examenjee.security.Entities.AppRole;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRoleName(String roleName);
}
