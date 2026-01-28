package chat_app.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import chat_app.app.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
