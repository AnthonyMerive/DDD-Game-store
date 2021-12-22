package Store.events;

import Store.values.Name;
import Store.values.Price;
import Store.values.Ranking;
import Store.values.VideoGameID;
import co.com.sofka.domain.generic.DomainEvent;

public class VideoGameAdded extends DomainEvent {

    private final VideoGameID videoGameID;
    private final Name name;
    private final Price price;
    private final Ranking ranking;

    public VideoGameAdded(VideoGameID videoGameID, Name name, Price price, Ranking ranking) {

        super("game-store.store.video-game-added");

        this.videoGameID = videoGameID;
        this.name = name;
        this.price = price;
        this.ranking = ranking;
    }

    public VideoGameID videoGameID() {
        return videoGameID;
    }

    public Name name() {
        return name;
    }

    public Price price() {
        return price;
    }

    public Ranking ranking() {
        return ranking;
    }
}
