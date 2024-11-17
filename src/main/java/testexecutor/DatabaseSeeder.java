package testexecutor;

import testexecutor.model.User;
import testexecutor.model.Query;
import testexecutor.repository.UserRepository;
import testexecutor.repository.QueryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.Date;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final QueryRepository queryRepository;

    public DatabaseSeeder(UserRepository userRepository, QueryRepository queryRepository) {
        this.userRepository = userRepository;
        this.queryRepository = queryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Users
        User adminUser = new User("U001", "Admin User", "admin@example.com", "adminpass", "admin");
        User examinerUser = new User("U002", "Examiner User", "examiner@example.com", "examinerpass", "examiner");
        User examineeUser = new User("U003", "Examinee User", "examinee@example.com", "examineepass", "examinee");

        userRepository.saveAll(Arrays.asList(adminUser, examinerUser, examineeUser));

        // Queries
        Query query1 = new Query("Q001", "Issue with login.", new Date(), "Pending", examinerUser);
        Query query2 = new Query("Q002", "Unable to access test.", new Date(), "Pending", examineeUser);

        queryRepository.saveAll(Arrays.asList(query1, query2));
    }
}
