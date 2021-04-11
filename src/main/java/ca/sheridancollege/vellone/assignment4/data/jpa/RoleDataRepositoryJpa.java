package ca.sheridancollege.vellone.assignment4.data.jpa;


import ca.sheridancollege.vellone.assignment4.data.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDataRepositoryJpa extends JpaRepository<RoleEntity, Integer> {
    RoleEntity findRoleEntityByRoleNameIs(String roleName);
}
