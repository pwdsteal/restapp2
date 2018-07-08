package restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restapp.dao.User;

public interface UserJpaRepository extends JpaRepository<User, Long> {
}
