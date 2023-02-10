package data.repositories;

import data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplementationTest {
    private UserRepository userRepository;
    User user = new User();
    @BeforeEach
    public void setUp(){
        userRepository = new UserRepositoryImplementation();
    }
    @Test
    public void saveOneUser_countIsOneTest(){
        User user = new User();
        userRepository.save(user);
        assertEquals(1, userRepository.count());
    }
    @Test
    public void saveOneUser_idOfUserIsOneTest(){
        userRepository.save(user);
        assertEquals(1, userRepository.count());
    }
}