package UserControl.events;

import co.com.sofka.domain.generic.DomainEvent;

public class NameUpdate extends DomainEvent {

    public NameUpdate() {
        super("game-store.user-control.name-update");
    }
}
