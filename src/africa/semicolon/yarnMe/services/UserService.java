package africa.semicolon.yarnMe.services;

import africa.semicolon.yarnMe.data.models.User;
import africa.semicolon.yarnMe.dtos.requests.RegisterRequest;
import africa.semicolon.yarnMe.dtos.responses.FindUserResponse;

import java.util.List;

public interface UserService {
    User register(RegisterRequest request);

    FindUserResponse findUser(int id);

    //List<FindUserResponse> findAll();

    void delete(User user);

    void delete(int id);

//  void deleteAll();

//  FindUserResponse findByUsername();

//  User findId(int id);
}