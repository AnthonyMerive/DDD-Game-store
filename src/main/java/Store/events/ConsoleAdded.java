package Store.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ConsoleAdded extends DomainEvent {

    public ConsoleAdded() {
        super("game-store.store.console-added");
    }
}
