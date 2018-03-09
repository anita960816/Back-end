package rc.springbootmongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class DbSeeder implements CommandLineRunner {
    private UserRepository userRepository;

    public DbSeeder(UserRepository userRepository){
        this.userRepository = userRepository;
    }



    @Override
    public void run(String... strings) throws Exception{
        User Juan = new User(
             "Juan",
             "Calle 30",
            Arrays.asList(
                    new Note ("Note 1", 1,  true)
            )

        );
        User Ana = new User(
                "Ana",
                "Calle 666",
                Arrays.asList(
                        new Note ("Note 2", 2,  true)
                )

        );

        User Luisa = new User(
                "Luisa",
                "Calle 100",
                Arrays.asList(
                        new Note ("Note 3", 3,  true)
                )

        );

        //drop all users
        this.userRepository.deleteAll();

        //add our users to the database
        List<User> users = Arrays.asList(Juan);
        this.userRepository.save(Juan);


    }
}
