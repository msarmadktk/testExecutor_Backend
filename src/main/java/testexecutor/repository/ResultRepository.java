package testexecutor.repository;

import testexecutor.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, String> {

    List<Result> findByExaminee_UserID(String examineeId);
}
