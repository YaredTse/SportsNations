package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingTwoController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting_two")
    public GreetingTwo greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new GreetingTwo(counter.incrementAndGet(),
                String.format(template, name));
    }

}
