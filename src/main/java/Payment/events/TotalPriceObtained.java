package Payment.events;

import co.com.sofka.domain.generic.DomainEvent;

public class TotalPriceObtained extends DomainEvent {

    public TotalPriceObtained() {
        super("game-store.payment.total-price-obtained");
    }
}
