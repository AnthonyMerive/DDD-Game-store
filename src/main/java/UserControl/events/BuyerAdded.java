package UserControl.events;

import UserControl.values.BuyerID;
import UserControl.values.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class BuyerAdded extends DomainEvent {

    private final BuyerID buyerID;
    private final Name name;

    public BuyerAdded(BuyerID buyerID, Name name) {

        super("game-store.user-control.buyer-added");

        this.buyerID = buyerID;
        this.name = name;
    }

    public BuyerID buyerID() {
        return buyerID;
    }

    public Name name() {
        return name;
    }
}
