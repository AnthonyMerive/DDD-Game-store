package Store;

import Store.values.ConsoleID;
import Store.values.Name;
import Store.values.Price;
import Store.values.Type;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Console extends Entity<ConsoleID> {

    private Name name;
    private Price price;
    private Type type;

    public Console(ConsoleID entityId, Name name, Price price, Type type) {
        super(entityId);
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateprice(Price price){
        this.price = Objects.requireNonNull(price);
    }

    public void updateType(Type type){
        this.type = Objects.requireNonNull(type);
    }

    public Name name() {
        return name;
    }

    public Price price() {
        return price;
    }

    public Type type() {
        return type;
    }

}
