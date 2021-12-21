package UserControl;

import UserControl.values.BuyerID;
import UserControl.values.Name;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Buyer extends Entity<BuyerID> {

    private Name name;

    public Buyer(BuyerID entityId, Name name) {
        super(entityId);
        this.name = name;
    }

    public Name name() {
        return name;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

}
