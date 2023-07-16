package controllers;

import dtos.requests.RegisterRequest;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public Object findUserById(int id) {
        return userService.findUser(id);
    }

    public Object register(RegisterRequest request) {
        try {
            return userService.register(request);
        } catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }
}
