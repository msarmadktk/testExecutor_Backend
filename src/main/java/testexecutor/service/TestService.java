package testexecutor.service;

import testexecutor.model.Test;
import testexecutor.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public List<Test> getAvailableTests() {
        return testRepository.findByStatus("Published");
    }

    public Test getTestById(String testId) {
        return testRepository.findById(testId)
                .orElseThrow(() -> new RuntimeException("Test not found"));
    }
    
    public List<Test> getTestsByExaminerId(String examinerId) {
        return testRepository.findByExaminer_UserID(examinerId);
    }

}
