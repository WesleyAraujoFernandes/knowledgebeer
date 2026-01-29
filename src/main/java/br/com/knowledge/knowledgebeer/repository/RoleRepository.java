package br.com.knowledge.knowledgebeer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.knowledge.knowledgebeer.model.ERole;
import br.com.knowledge.knowledgebeer.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);

}
