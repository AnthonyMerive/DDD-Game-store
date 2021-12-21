package UserControl;

import UserControl.values.UserControlID;
import co.com.sofka.domain.generic.AggregateEvent;

public class UserControl extends AggregateEvent<UserControlID> {

    public UserControl(UserControlID entityId) {
        super(entityId);
    }
}
