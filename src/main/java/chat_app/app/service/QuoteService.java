package chat_app.app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import chat_app.app.model.Quote;

@Service
public class QuoteService {

    private final RestTemplate restTemplate = new RestTemplate();

    public Quote getRandomQuote() {
        return restTemplate.getForObject(
                "http://api.quotable.io/random",
                Quote.class
        );
    }
}