package miage.sm.event.service;

import miage.sm.event.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Service
public class UserMockService {
    private Long countUser = 0L;
    private List<User>  users= new ArrayList<User>(List.of(new User(this.countUser++, "admin1@gmail.com", "1234567890")));


    public List<User> getAllUsers(){
        return this.users;
    }



    public User addUser(String mail, String password) throws Exception {

        boolean present = this.users.stream().anyMatch(user1 -> Objects.equals(user1.getMail(), mail) && Objects.equals(user1.getPassword(), password));

        if (present){
            throw new Exception("User déja inscrit");
        }
        User newUser = new User(this.countUser++, mail, password);
        users.add(newUser);
        return newUser;

    }

    public User loginUser(String mail, String password) throws Exception {
        User user = this.users.stream().filter(user1 -> Objects.equals(user1.getMail(), mail) && Objects.equals(user1.getPassword(), password)).findFirst().get();

        if (!users.contains(user)) {
            throw new Exception("User non inscrit");
        }
        return user;

    }

}
