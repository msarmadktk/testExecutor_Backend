package testexecutor.controller;

import testexecutor.model.Analytics;
import testexecutor.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/analytics")
@CrossOrigin(origins = "http://localhost:3000")
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    // GET /api/analytics/examiner/{examinerId}
    @GetMapping("/examiner/{examinerId}")
    public List<Analytics> getAnalyticsByExaminer(@PathVariable String examinerId) {
        return analyticsService.getAnalyticsByExaminerId(examinerId);
    }

    // GET /api/analytics/test/{testId}
    @GetMapping("/test/{testId}")
    public Analytics getAnalyticsByTest(@PathVariable String testId) {
        return analyticsService.generateAnalytics(testId);
    }
}
