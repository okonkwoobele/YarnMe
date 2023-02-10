package data.repositories;

import data.models.User;

import java.util.List;

public class UserRepositoryImplementation implements UserRepository {
    private int count;
    @Override
    public User save(User user) {
        user.setId(generateUser());
        count++;
        return user;
    }

    private int generateUser() {
        return count+1;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void deleteAll() {

    }
}
