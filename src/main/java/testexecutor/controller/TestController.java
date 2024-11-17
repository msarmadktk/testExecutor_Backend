package testexecutor.controller;

import testexecutor.model.Test;
import testexecutor.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tests")
@CrossOrigin(origins = "http://localhost:3000")
public class TestController {

    @Autowired
    private TestService testService;

    // GET /api/tests/available
    @GetMapping("/available")
    public List<Test> getAvailableTests() {
        return testService.getAvailableTests();
    }

    // GET /api/tests/{testId}
    @GetMapping("/{testId}")
    public Test getTestById(@PathVariable String testId) {
        return testService.getTestById(testId);
    }
 // GET /api/tests/examiner/{examinerId}
    @GetMapping("/examiner/{examinerId}")
    public List<Test> getTestsByExaminer(@PathVariable String examinerId) {
        return testService.getTestsByExaminerId(examinerId);
    }

}
