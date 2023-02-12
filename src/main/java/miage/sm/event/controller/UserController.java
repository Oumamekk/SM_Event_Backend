package miage.sm.event.controller;


import miage.sm.event.model.User;
import miage.sm.event.service.UserMockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("http://localhost:4200")
@RestController
public class UserController {


    @Autowired
    private UserMockService userMockService;


    @PostMapping(path ="/api/users/register/{mail}/{password}")
    User addUser(@PathVariable String mail, @PathVariable String password) throws Exception {
        return userMockService.addUser(mail, password);
    }

    @PostMapping(path ="/api/users/login/{mail}/{password}")
    User loginUser(@PathVariable String mail, @PathVariable String password) throws Exception {
        return userMockService.loginUser(mail, password);
    }

}
