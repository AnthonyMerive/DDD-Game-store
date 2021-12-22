package UserControl;

import UserControl.events.BuyerAdded;
import UserControl.events.SellerAdded;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class UserControlChange extends EventChange {

    public UserControlChange(UserControl userControl) {
        apply((BuyerAdded event) -> {
            userControl.buyer = new HashSet<>();
        });

        apply((SellerAdded event) ->{
            userControl.seller = new HashSet<>();
        });
    }
}
