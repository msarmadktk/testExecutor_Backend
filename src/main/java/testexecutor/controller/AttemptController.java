package testexecutor.controller;

import testexecutor.model.Attempt;
import testexecutor.service.AttemptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/attempts")
@CrossOrigin(origins = "http://localhost:3000")
public class AttemptController {

    @Autowired
    private AttemptService attemptService;

    // POST /api/attempts
    @PostMapping
    public Attempt submitAttempt(@RequestBody Attempt attempt) {
        return attemptService.submitAttempt(attempt);
    }
}
