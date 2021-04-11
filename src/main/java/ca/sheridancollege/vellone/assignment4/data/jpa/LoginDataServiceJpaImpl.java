package ca.sheridancollege.vellone.assignment4.data.jpa;


import ca.sheridancollege.vellone.assignment4.data.LoginDataService;
import ca.sheridancollege.vellone.assignment4.data.entity.RoleEntity;
import ca.sheridancollege.vellone.assignment4.data.entity.UserEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class LoginDataServiceJpaImpl implements LoginDataService {

    private final UserDataRepositoryJpa userDataRepository;
    private final RoleDataRepositoryJpa roleDataRepository;
    private final PasswordEncoder passwordEncoder;

    public LoginDataServiceJpaImpl(
            UserDataRepositoryJpa userDataRepository,
            RoleDataRepositoryJpa roleDataRepository,
            PasswordEncoder passwordEncoder) {
        this.userDataRepository = userDataRepository;
        this.roleDataRepository = roleDataRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean userExists(String userName) {
        return userDataRepository.findUserEntityByUserNameIs(userName) != null;
    }

    @Override
    public List<String> getAllUserNames(String roleName) {
        List<String> userNames = new ArrayList<>();
        RoleEntity roleEntity = roleDataRepository.findRoleEntityByRoleNameIs(roleName);
        if(roleEntity != null){
            List<UserEntity> users = roleEntity.getUsers();
            for(UserEntity userEntity: users){
                userNames.add(userEntity.getUserName());
            }
        }
        return userNames;
    }

    @Override
    public List<String> getAllRoleNames(String userName) {
        List<String> roleNames = new ArrayList<>();
        UserEntity userEntity = userDataRepository.findUserEntityByUserNameIs(userName);
        if(userEntity != null){
            List<RoleEntity> roles = userEntity.getRoles();
            for(RoleEntity roleEntity: roles){
                roleNames.add(roleEntity.getRoleName());
            }
        }
        return roleNames;
    }

    @Override
    public boolean checkPassword(String userName, String password) {
        String storedPassword = getPassword(userName);
        if(storedPassword != null) {
            return passwordEncoder.matches(password, storedPassword);
        }else{
            return false;
        }
    }

    @Override
    public String getPassword(String userName) {
        UserEntity userEntity = userDataRepository.findUserEntityByUserNameIs(userName);
        if(userEntity != null){
            return userEntity.getPassword();
        }else{
            return null;
        }
    }
}