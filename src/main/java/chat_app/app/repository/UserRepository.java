package chat_app.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import chat_app.app.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
