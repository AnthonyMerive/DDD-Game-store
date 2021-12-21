package ProductInventory.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ProductDeleted extends DomainEvent {

    public ProductDeleted() {
        super("game-store.inventory.product-deleted");
    }
}
