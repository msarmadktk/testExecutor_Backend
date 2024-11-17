package testexecutor.controller;

import testexecutor.model.Result;
import testexecutor.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/results")
@CrossOrigin(origins = "http://localhost:3000")
public class ResultController {

    @Autowired
    private ResultService resultService;

    // GET /api/results/{examineeId}
    @GetMapping("/{examineeId}")
    public List<Result> getResultsByExaminee(@PathVariable String examineeId) {
        return resultService.getResultsByExamineeId(examineeId);
    }
}
