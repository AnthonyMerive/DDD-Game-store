package Payment.events;

import Store.values.Price;
import co.com.sofka.domain.generic.DomainEvent;

public class TotalPriceObtained extends DomainEvent {

    private final Price price;

    public TotalPriceObtained(Price price) {

        super("game-store.payment.total-price-obtained");

        this.price = price;
    }

    public Price price() {
        return price;
    }
}
