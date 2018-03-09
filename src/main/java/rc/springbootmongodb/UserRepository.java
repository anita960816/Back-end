package rc.springbootmongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String>{
    User findbyId(String id);
    User findbyUsername(String name);

    void delete(String id);
}
