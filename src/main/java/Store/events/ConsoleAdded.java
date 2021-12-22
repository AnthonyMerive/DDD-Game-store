package Store.events;

import Store.values.ConsoleID;
import Store.values.Name;
import Store.values.Price;
import Store.values.Type;
import co.com.sofka.domain.generic.DomainEvent;

public class ConsoleAdded extends DomainEvent {

    private final ConsoleID consoleID;
    private final Name name;
    private final Price price;
    private final Type tipe;

    public ConsoleAdded(ConsoleID consoleID, Name name, Price price, Type type) {

        super("game-store.store.console-added");

        this.consoleID = consoleID;
        this.name = name;
        this.price = price;
        this.tipe = type;
    }

    public ConsoleID consoleID() {
        return consoleID;
    }

    public Name name() {
        return name;
    }

    public Price price() {
        return price;
    }

    public Type tipe() {
        return tipe;
    }
}
