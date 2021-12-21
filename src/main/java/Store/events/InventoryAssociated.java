package Store.events;

import co.com.sofka.domain.generic.DomainEvent;

public class InventoryAssociated extends DomainEvent {

    public InventoryAssociated() {
        super("game-store.store.inventory-associated");
    }
}
