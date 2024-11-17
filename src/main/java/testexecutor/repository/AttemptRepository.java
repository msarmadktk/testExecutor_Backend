package testexecutor.repository;

import testexecutor.model.Attempt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AttemptRepository extends JpaRepository<Attempt, String> {

    List<Attempt> findByExaminee_UserID(String examineeId);
}
