package Store;

import Store.events.ConsoleAdded;
import Store.events.InventoryAssociated;
import Store.events.VideoGameAdded;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class StoreChange extends EventChange {

    public StoreChange(Store store) {
        apply((ConsoleAdded event) -> {
            var numConsolas = store.consoles().size();

            if(numConsolas == 10000){
                throw new IllegalArgumentException("limit: 10000");
            }

            store.consoles.add(new Console(
                    event.consoleID(),
                    event.name(),
                    event.price(),
                    event.tipe()
            ));

        });

        apply((VideoGameAdded event) ->{
            var numVideoGames= store.videoGames.size();

            if(numVideoGames == 10000){
                throw new IllegalArgumentException("limit: 10000");
            }

            store.videoGames.add(new VideoGame(
                    event.videoGameID(),
                    event.name(),
                    event.price(),
                    event.ranking()
            ));
        });

        apply((InventoryAssociated event) ->{
            store.inventoryID = event.inventoryID();
        });
    }

}
