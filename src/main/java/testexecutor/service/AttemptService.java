package testexecutor.service;

import testexecutor.model.Attempt;
import testexecutor.repository.AttemptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttemptService {

    @Autowired
    private AttemptRepository attemptRepository;

    public Attempt submitAttempt(Attempt attempt) {
        return attemptRepository.save(attempt);
    }
}
