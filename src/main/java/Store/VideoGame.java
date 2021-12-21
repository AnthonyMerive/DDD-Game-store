package Store;

import Store.values.Name;
import Store.values.Price;
import Store.values.Ranking;
import Store.values.VideoGameID;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class VideoGame extends Entity<VideoGameID> {

    private Name name;
    private Price price;
    private Ranking ranking;

    public VideoGame(VideoGameID entityId, Name name, Price price, Ranking ranking) {
        super(entityId);
        this.name = name;
        this.price = price;
        this.ranking = ranking;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateprice(Price price){
        this.price = Objects.requireNonNull(price);
    }

    public void updateRanking(Ranking ranking){
        this.ranking = Objects.requireNonNull(ranking);
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
