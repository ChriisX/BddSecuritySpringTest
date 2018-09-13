package fr.learning.bdd_security.repositories;

import fr.learning.bdd_security.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {

}
