package Payment;

import Payment.values.PaymentID;
import co.com.sofka.domain.generic.Entity;

public class Accountability extends Entity<PaymentID> {

    public Accountability(PaymentID entityId) {
        super(entityId);
    }
}
