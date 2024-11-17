package testexecutor.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "queries")
public class Query {

    @Id
    private String queryID;
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private String status;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors
    public Query() {}

    public Query(String queryID, String content, Date date, String status, User user) {
        this.queryID = queryID;
        this.content = content;
        this.date = date;
        this.status = status;
        this.user = user;
    }

    // Getters and Setters
    public String getQueryID() { return queryID; }
    public void setQueryID(String queryID) { this.queryID = queryID; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
