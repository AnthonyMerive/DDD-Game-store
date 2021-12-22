package Payment;

import Payment.events.PaymentMethodAdded;
import Payment.events.SentToAccountability;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class PaymentChange extends EventChange {

    public PaymentChange(Payment payment) {
        apply((PaymentMethodAdded event) -> {
            payment.paymentMethods = new HashSet<>();
        });

        apply((SentToAccountability event) ->{
            payment.accountabilities = new HashSet<>();
        });
    }
}
