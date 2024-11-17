package testexecutor.controller;

import testexecutor.model.Payment;
import testexecutor.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "http://localhost:3000")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // GET /api/payments/examiner/{examinerId}
    @GetMapping("/examiner/{examinerId}")
    public List<Payment> getPaymentsByExaminer(@PathVariable String examinerId) {
        return paymentService.getPaymentsByExaminerId(examinerId);
    }

    // POST /api/payments
    @PostMapping
    public Payment makePayment(@RequestBody Payment payment) {
        return paymentService.makePayment(payment);
    }
}
