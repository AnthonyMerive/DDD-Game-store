package Payment.events;

import co.com.sofka.domain.generic.DomainEvent;

public class PaymentMethodAdded extends DomainEvent {

    public PaymentMethodAdded() {
        super("game-store.payment.payment-method-added");
    }
}
