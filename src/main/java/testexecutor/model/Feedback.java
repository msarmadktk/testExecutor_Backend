package testexecutor.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "feedbacks")
public class Feedback {

    @Id
    private String feedbackID;
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "examinee_id")
    private User examinee;

    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;

    // Constructors
    public Feedback() {}

    public Feedback(String feedbackID, String content, Date date, User examinee, Test test) {
        this.feedbackID = feedbackID;
        this.content = content;
        this.date = date;
        this.examinee = examinee;
        this.test = test;
    }

    // Getters and Setters
    public String getFeedbackID() { return feedbackID; }
    public void setFeedbackID(String feedbackID) { this.feedbackID = feedbackID; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public User getExaminee() { return examinee; }
    public void setExaminee(User examinee) { this.examinee = examinee; }

    public Test getTest() { return test; }
    public void setTest(Test test) { this.test = test; }
}
