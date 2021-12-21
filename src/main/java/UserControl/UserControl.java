package UserControl;

import UserControl.values.UserControlID;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class UserControl extends AggregateEvent<UserControlID> {

    protected Set<Buyer> buyer;
    protected Set<Seller> seller;

    public UserControl(UserControlID entityId) {
        super(entityId);
    }
}
