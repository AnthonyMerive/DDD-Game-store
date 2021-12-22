package Store.events;

import ProductInventory.values.InventoryID;
import co.com.sofka.domain.generic.DomainEvent;

public class InventoryAssociated extends DomainEvent {

    private final InventoryID inventoryID;

    public InventoryAssociated(InventoryID inventoryID) {

        super("game-store.store.inventory-associated");

        this.inventoryID = inventoryID;

    }

    public InventoryID inventoryID() {
        return inventoryID;
    }
}
