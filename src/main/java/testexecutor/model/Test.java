package testexecutor.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tests")
public class Test {

    @Id
    private String testID;
    private String title;
    private int duration;
    private String status;
    private String instructions;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "examiner_id")
    private User examiner;

    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
    private List<Question> questions;

    // Constructors
    public Test() {}

    public Test(String testID, String title, int duration, String status, String instructions, User examiner) {
        this.testID = testID;
        this.title = title;
        this.duration = duration;
        this.status = status;
        this.instructions = instructions;
        this.examiner = examiner;
    }

    // Getters and Setters
    public String getTestID() { return testID; }
    public void setTestID(String testID) { this.testID = testID; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) { this.instructions = instructions; }

    public User getExaminer() { return examiner; }
    public void setExaminer(User examiner) { this.examiner = examiner; }

    public List<Question> getQuestions() { return questions; }
    public void setQuestions(List<Question> questions) { this.questions = questions; }
}
