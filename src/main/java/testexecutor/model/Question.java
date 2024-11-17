package testexecutor.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    private String questionID;
    private String text;
    private String type; // e.g., "MCQ", "Subjective"
    private String correctAnswer;
    private boolean correctSelected;
    private int totalMarks;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;

    @ElementCollection
    @CollectionTable(name = "question_options", joinColumns = @JoinColumn(name = "question_id"))
    @Column(name = "option_text")
    private List<String> options;

    // Constructors
    public Question() {}

    public Question(String questionID, String text, String type, String correctAnswer, boolean correctSelected, int totalMarks, Test test) {
        this.questionID = questionID;
        this.text = text;
        this.type = type;
        this.correctAnswer = correctAnswer;
        this.correctSelected = correctSelected;
        this.totalMarks = totalMarks;
        this.test = test;
    }

    // Getters and Setters
    public String getQuestionID() { return questionID; }
    public void setQuestionID(String questionID) { this.questionID = questionID; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getCorrectAnswer() { return correctAnswer; }
    public void setCorrectAnswer(String correctAnswer) { this.correctAnswer = correctAnswer; }

    public boolean isCorrectSelected() { return correctSelected; }
    public void setCorrectSelected(boolean correctSelected) { this.correctSelected = correctSelected; }

    public int getTotalMarks() { return totalMarks; }
    public void setTotalMarks(int totalMarks) { this.totalMarks = totalMarks; }

    public Test getTest() { return test; }
    public void setTest(Test test) { this.test = test; }

    public List<String> getOptions() { return options; }
    public void setOptions(List<String> options) { this.options = options; }
}
