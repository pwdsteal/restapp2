package restapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import restapp.controller.model.User;
import restapp.repository.UserJpaRepository;

@RestController
public class UserController {

    @Autowired
    UserJpaRepository repository;

    @PostMapping(value = "/user",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    private User addUser(@RequestBody User user) {
        repository.save(new restapp.dao.User());
        return user;
    }
}
