package Store;

import ProductInventory.values.InventoryID;
import Store.values.StoreID;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Store extends AggregateEvent<StoreID> {

    protected Set<Console> consoles;
    protected Set<VideoGame> videoGames;
    protected InventoryID inventoryID;

    public Store(StoreID entityId) {
        super(entityId);
    }
}
