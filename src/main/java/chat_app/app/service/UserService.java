package chat_app.app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import chat_app.app.model.User;
import chat_app.app.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User create(User user) {
        return repository.save(user);
    }

    public List<User> getAll() {
        return repository.findAll();
    }
}
