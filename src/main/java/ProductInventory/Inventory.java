package ProductInventory;

import ProductInventory.values.InventoryID;
import co.com.sofka.domain.generic.AggregateEvent;

public class Inventory extends AggregateEvent<InventoryID> {

    public Inventory(InventoryID entityId) {
        super(entityId);
    }
}
