package testexecutor.service;

import testexecutor.model.Result;
import testexecutor.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    public List<Result> getResultsByExamineeId(String examineeId) {
        return resultRepository.findByExaminee_UserID(examineeId);
    }
}
