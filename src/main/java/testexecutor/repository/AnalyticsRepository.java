package testexecutor.repository;

import testexecutor.model.Analytics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AnalyticsRepository extends JpaRepository<Analytics, String> {

    List<Analytics> findByExaminer_UserID(String examinerId);
}
