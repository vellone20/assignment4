package ca.sheridancollege.vellone.assignment4.data;

import java.util.List;

public interface LoginDataService {
    boolean userExists(String userName);
    List<String> getAllUserNames(String roleName);
    List<String> getAllRoleNames(String userName);
    boolean checkPassword(String userName, String password);
    String getPassword(String userName);
}
