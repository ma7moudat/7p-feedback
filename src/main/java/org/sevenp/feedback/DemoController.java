package org.sevenp.feedback;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping
    public String getMessage() {
        return "Hello World!";
    }
}
