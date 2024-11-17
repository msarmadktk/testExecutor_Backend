package testexecutor.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "analytics")
public class Analytics {

    @Id
    private String analyticsID;
    private String data;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "examiner_id")
    private User examiner;

    @OneToMany(mappedBy = "analytics", cascade = CascadeType.ALL)
    private List<Result> resultsAnalyzed;

    // Constructors
    public Analytics() {}

    public Analytics(String analyticsID, String data, User examiner) {
        this.analyticsID = analyticsID;
        this.data = data;
        this.examiner = examiner;
    }

    // Getters and Setters
    // ...
}
