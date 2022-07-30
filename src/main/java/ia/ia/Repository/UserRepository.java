package ia.ia.Repository;

import ia.ia.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
  User findByEmail(String email);
}
