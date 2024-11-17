package testexecutor.service;

import testexecutor.model.Payment;
import testexecutor.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getPaymentsByExaminerId(String examinerId) {
        return paymentRepository.findByExaminer_UserID(examinerId);
    }

    public Payment makePayment(Payment payment) {
        // Implement payment processing logic
        return paymentRepository.save(payment);
    }
}
