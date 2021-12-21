package Store.events;

import co.com.sofka.domain.generic.DomainEvent;

public class VideoGameAdded extends DomainEvent {

    public VideoGameAdded() {
        super("game-store.store.video-game-added");
    }
}
