package ca.sheridancollege.vellone.assignment4.data.jpa;


import ca.sheridancollege.vellone.assignment4.data.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepositoryJpa extends JpaRepository<UserEntity, Integer> {
    UserEntity findUserEntityByUserNameIs(String userName);
}
