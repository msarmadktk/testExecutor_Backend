package testexecutor.service;

import testexecutor.model.Query;
import testexecutor.repository.QueryRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class QueryService {

    private final QueryRepository queryRepository;

    // Constructor
    public QueryService(QueryRepository queryRepository) {
        this.queryRepository = queryRepository;
    }

    // Methods
    public List<Query> getAllQueries() {
        return queryRepository.findAll();
    }

    public Optional<Query> getQueryById(String queryId) {
        return queryRepository.findById(queryId);
    }

    public void resolveQuery(String queryId) {
        Query query = queryRepository.findById(queryId)
                .orElseThrow(() -> new RuntimeException("Query not found"));
        query.setStatus("Resolved");
        queryRepository.save(query);
    }
}
