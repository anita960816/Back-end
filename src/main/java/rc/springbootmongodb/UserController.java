package rc.springbootmongodb;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/users")
@RequestMapping(path="/api/products/")
public class UserController {
    private UserRepository userRepository;

    public UserController (UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @GetMapping("/all")
    public List<User> getAll(){
        List<User> users = this.userRepository.findAll();

        return users;
    }
    @PutMapping
    public void  insert(@RequestBody User user){
        this.userRepository.insert(user);
    }

    @PostMapping
    public void update(@RequestBody User user){
        this.userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        this.userRepository.delete(id);
    }


    @GetMapping("/{id}")
    public User getById(@PathVariable("id") String id){
        User user=this.userRepository.findbyId(id);

        return user;
    }













}
