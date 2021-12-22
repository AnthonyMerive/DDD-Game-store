package UserControl;

import Store.events.ConsoleAdded;
import UserControl.events.BuyerAdded;
import UserControl.events.SellerAdded;
import UserControl.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Set;

public class UserControl extends AggregateEvent<UserControlID> {

    protected Set<Buyer> buyer;
    protected Set<Seller> seller;

    public UserControl(UserControlID entityId) {
        super(entityId);
    }

    public void addBuyer(BuyerID buyerID, Name name){

        Objects.requireNonNull(buyerID);
        Objects.requireNonNull(name);

        appendChange(new BuyerAdded(buyerID, name)).apply();

    }

    public void addSeller(SellerID sellerID, Name name, Products products){

        Objects.requireNonNull(sellerID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(products);

        appendChange(new SellerAdded(sellerID, name, products)).apply();

    }

}
