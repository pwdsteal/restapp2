package restapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import restapp.dao.User;
import restapp.repository.UserJpaRepository;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserJpaRepository repository;

    @PostMapping(value = "/user",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    private User addUser(@RequestBody User user) {
        repository.save(user);
        return user;
    }

    @GetMapping(value = "/user",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private List<User> getUsers() {
        return repository.findAll();
    }
}
