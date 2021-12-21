package Payment;

import Payment.values.PaymentID;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Payment extends AggregateEvent<PaymentID> {

    protected Set<PaymentMethod> paymentMethods;
    protected Set<Accountability> accountabilities;

    public Payment(PaymentID entityId) {
        super(entityId);
    }
}
