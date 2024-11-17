package testexecutor.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    private String paymentID;
    private double amount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private String method;
    private String status;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "examiner_id")
    private User examiner;

    // Constructors
    public Payment() {}

    public Payment(String paymentID, double amount, Date date, String method, String status, User examiner) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.date = date;
        this.method = method;
        this.status = status;
        this.examiner = examiner;
    }

    // Getters and Setters
    // ...
}
