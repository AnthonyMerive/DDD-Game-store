package ProductInventory.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ProductAdded extends DomainEvent {

    public ProductAdded() {
        super("game-store.inventory.product-added");
    }
}
