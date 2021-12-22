package Store;

import ProductInventory.values.InventoryID;
import Store.events.ConsoleAdded;
import Store.events.InventoryAssociated;
import Store.events.VideoGameAdded;
import Store.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Set;

public class Store extends AggregateEvent<StoreID> {

    protected Set<Console> consoles;
    protected Set<VideoGame> videoGames;
    protected InventoryID inventoryID;

    public Store(StoreID entityId) {
        super(entityId);
    }

    public void addConsole(ConsoleID consoleID, Name name, Price price, Type type){

        Objects.requireNonNull(consoleID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(price);
        Objects.requireNonNull(type);

        appendChange(new ConsoleAdded(consoleID, name, price, type)).apply();

    }

    public void addVideoGame(VideoGameID videoGameID, Name name, Price price, Ranking ranking){

        Objects.requireNonNull(videoGameID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(price);
        Objects.requireNonNull(ranking);

        appendChange(new VideoGameAdded(videoGameID, name, price, ranking)).apply();
    }

    public void associateInventory(InventoryID inventoryID){

        Objects.requireNonNull(inventoryID);

        appendChange(new InventoryAssociated(inventoryID)).apply();

    }

    public Set<Console> consoles() {
        return consoles;
    }

    public Set<VideoGame> videoGames() {
        return videoGames;
    }

    public InventoryID inventoryID() {
        return inventoryID;
    }

}
