package Payment.events;

import co.com.sofka.domain.generic.DomainEvent;

public class SentToAccountability extends DomainEvent {

    public SentToAccountability() {
        super("game-store.payment.sent-to-accountability");
    }
}
