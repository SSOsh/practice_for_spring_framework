package springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class practiceController {

    @GetMapping("/practice")
    public String practice() {
        return "practice";
    }
}
