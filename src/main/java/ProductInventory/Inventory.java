package ProductInventory;

import ProductInventory.values.InventoryID;
import UserControl.values.Products;
import co.com.sofka.domain.generic.AggregateEvent;

public class Inventory extends AggregateEvent<InventoryID> {

    protected Products products;

    public Inventory(InventoryID entityId) {
        super(entityId);
    }
}
