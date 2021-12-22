package UserControl.events;

import UserControl.values.Name;
import UserControl.values.Products;
import UserControl.values.SellerID;
import co.com.sofka.domain.generic.DomainEvent;

public class SellerAdded extends DomainEvent {

    private final SellerID sellerID;
    private final Name name;
    private final Products products;

    public SellerAdded(SellerID sellerID, Name name, Products products) {

        super("game-store.user-control.seller-added");

        this.sellerID = sellerID;
        this.name = name;
        this.products = products;
    }

    public SellerID sellerID() {
        return sellerID;
    }

    public Name name() {
        return name;
    }

    public Products products() {
        return products;
    }
}
