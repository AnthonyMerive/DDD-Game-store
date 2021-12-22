package Payment.events;

import Payment.values.PaymentID;
import co.com.sofka.domain.generic.DomainEvent;

public class SentToAccountability extends DomainEvent {

    private final PaymentID paymentID;

    public SentToAccountability(PaymentID paymentID) {

        super("game-store.payment.sent-to-accountability");

        this.paymentID = paymentID;
    }

    public PaymentID paymentID() {
        return paymentID;
    }
}
