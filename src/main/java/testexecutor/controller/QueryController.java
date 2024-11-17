package testexecutor.controller;

import testexecutor.model.Query;
import testexecutor.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/queries")
public class QueryController {

    @Autowired
    private QueryService queryService;

    // GET /api/queries
    @GetMapping
    public List<Query> getAllQueries() {
        return queryService.getAllQueries();
    }

    // POST /api/queries/{queryId}/resolve
    @PostMapping("/{queryId}/resolve")
    public void resolveQuery(@PathVariable String queryId) {
        queryService.resolveQuery(queryId);
    }
    
    
}
