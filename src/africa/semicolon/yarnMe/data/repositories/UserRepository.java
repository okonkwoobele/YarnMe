package data.repositories;

import data.models.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    User findById(int id);
    long count();
    List<User> findAll();
    void deleteByUser(User user);
    void deleteById(int id);
    void deleteAll();
    User findUserByUsername(String username);
}