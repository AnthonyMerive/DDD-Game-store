package Payment.events;

import Payment.values.Methods;
import Payment.values.PaymentID;
import Store.values.Price;
import co.com.sofka.domain.generic.DomainEvent;

public class PaymentMethodAdded extends DomainEvent {

    private final PaymentID paymentID;
    private final Methods methods;
    private final Price price;

    public PaymentMethodAdded(PaymentID paymentID, Methods methods, Price price) {

        super("game-store.payment.payment-method-added");

        this.paymentID = paymentID;
        this.methods = methods;
        this.price = price;
    }

    public PaymentID paymentID() {
        return paymentID;
    }

    public Methods methods() {
        return methods;
    }

    public Price price() {
        return price;
    }
}
