package ProductInventory.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ProductsUpdated extends DomainEvent {

    public ProductsUpdated() {
        super("game-store.inventory.products-updated");
    }
}
