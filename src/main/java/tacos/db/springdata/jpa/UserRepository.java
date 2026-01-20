package tacos.db.springdata.jpa;

import org.springframework.data.repository.CrudRepository;
import tacos.models.registration.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
