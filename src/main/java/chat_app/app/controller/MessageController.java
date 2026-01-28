package chat_app.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import chat_app.app.model.Message;
import chat_app.app.service.MessageService;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService service;

    @PostMapping
    public Message create(@RequestBody Message message) {
        return service.create(message);
    }

    @GetMapping
    public List<Message> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Message getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Message update(@PathVariable Long id, @RequestBody Message message) {
        return service.update(id, message);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
