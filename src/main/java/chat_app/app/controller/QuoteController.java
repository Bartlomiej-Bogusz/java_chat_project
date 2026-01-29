package chat_app.app.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import chat_app.app.model.Quote;
import chat_app.app.service.QuoteService;

@RestController
@RequestMapping("/api/quote")
@RequiredArgsConstructor
public class QuoteController {

    private final QuoteService service;

    @GetMapping
    public Quote getQuote() {
        return service.getRandomQuote();
    }
}