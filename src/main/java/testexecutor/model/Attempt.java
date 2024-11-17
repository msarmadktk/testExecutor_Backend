package testexecutor.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Map;

@Entity
@Table(name = "attempts")
public class Attempt {

    @Id
    private String attemptID;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private int score;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "examinee_id")
    private User examinee;

    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;

    @ElementCollection
    @CollectionTable(name = "attempt_answers", joinColumns = @JoinColumn(name = "attempt_id"))
    @MapKeyColumn(name = "question_id")
    @Column(name = "answer")
    private Map<String, String> answers;

    // Constructors
    public Attempt() {}

    public Attempt(String attemptID, Date date, int score, User examinee, Test test) {
        this.attemptID = attemptID;
        this.date = date;
        this.score = score;
        this.examinee = examinee;
        this.test = test;
    }

    // Getters and Setters
    public String getAttemptID() { return attemptID; }
    public void setAttemptID(String attemptID) { this.attemptID = attemptID; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public User getExaminee() { return examinee; }
    public void setExaminee(User examinee) { this.examinee = examinee; }

    public Test getTest() { return test; }
    public void setTest(Test test) { this.test = test; }

    public Map<String, String> getAnswers() { return answers; }
    public void setAnswers(Map<String, String> answers) { this.answers = answers; }
}
