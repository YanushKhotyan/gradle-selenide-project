package service;

import model.api.User;

public interface AuthService extends BasicService{
    User createUser(User user);
    User login(User user);

}
