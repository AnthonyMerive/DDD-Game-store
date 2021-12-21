package Store;

import Store.values.StoreID;
import co.com.sofka.domain.generic.AggregateEvent;

public class Store extends AggregateEvent<StoreID> {

    public Store(StoreID entityId) {
        super(entityId);
    }
}
