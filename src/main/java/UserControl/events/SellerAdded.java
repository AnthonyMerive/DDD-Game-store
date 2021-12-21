package UserControl.events;

import co.com.sofka.domain.generic.DomainEvent;

public class SellerAdded extends DomainEvent {

    public SellerAdded() {
        super("game-store.user-control.seller-added");
    }
}
