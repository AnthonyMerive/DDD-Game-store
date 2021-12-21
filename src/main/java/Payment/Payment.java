package Payment;

import Payment.values.PaymentID;
import co.com.sofka.domain.generic.AggregateEvent;

public class Payment extends AggregateEvent<PaymentID> {
    
    public Payment(PaymentID entityId) {
        super(entityId);
    }
}
