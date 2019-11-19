package net.siekiera.hellodocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String hello() {
        logger.info("hello method called!");
        return "Hello World from docker!";
    }
}
