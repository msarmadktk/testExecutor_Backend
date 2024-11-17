package testexecutor.repository;

import testexecutor.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, String> {

    List<Test> findByExaminer_UserID(String examinerId);
    

    List<Test> findByStatus(String status);
}
