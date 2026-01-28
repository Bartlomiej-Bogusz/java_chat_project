package chat_app.app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import chat_app.app.model.Message;
import chat_app.app.repository.MessageRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository repository;

    public Message create(Message message) {
        message.setTimestamp(LocalDateTime.now());
        return repository.save(message);
    }

    public List<Message> getAll() {
        return repository.findAll();
    }

    public Message getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Message update(Long id, Message updated) {
        Message msg = getById(id);
        msg.setContent(updated.getContent());
        return repository.save(msg);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
