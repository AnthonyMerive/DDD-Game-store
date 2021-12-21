package UserControl.events;

import co.com.sofka.domain.generic.DomainEvent;

public class BuyerAdded extends DomainEvent {

    public BuyerAdded() {
        super("game-store.user-control.buyer-added");
    }
}
