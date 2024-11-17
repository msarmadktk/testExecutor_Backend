package testexecutor.model;

import jakarta.persistence.*;

@Entity
@Table(name = "results")
public class Result {

    @Id
    private String resultID;
    private int score;
    private String feedback;

    // Relationships
    @OneToOne
    @JoinColumn(name = "attempt_id")
    private Attempt attempt;

    @ManyToOne
    @JoinColumn(name = "examinee_id")
    private User examinee;

    // Constructors
    public Result() {}

    public Result(String resultID, int score, String feedback, Attempt attempt, User examinee) {
        this.resultID = resultID;
        this.score = score;
        this.feedback = feedback;
        this.attempt = attempt;
        this.examinee = examinee;
    }

    // Getters and Setters
    public String getResultID() { return resultID; }
    public void setResultID(String resultID) { this.resultID = resultID; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public String getFeedback() { return feedback; }
    public void setFeedback(String feedback) { this.feedback = feedback; }

    public Attempt getAttempt() { return attempt; }
    public void setAttempt(Attempt attempt) { this.attempt = attempt; }

    public User getExaminee() { return examinee; }
    public void setExaminee(User examinee) { this.examinee = examinee; }
}
