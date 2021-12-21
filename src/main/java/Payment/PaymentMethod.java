package Payment;

import Payment.values.Methods;
import Payment.values.PaymentID;
import Store.values.Price;
import co.com.sofka.domain.generic.Entity;

public class PaymentMethod extends Entity<PaymentID> {

    private final Methods methods;
    private final Price price;

    public PaymentMethod(PaymentID entityId, Methods methods, Price price) {
        super(entityId);
        this.methods = methods;
        this.price = price;
    }

    public Methods methods() {
        return methods;
    }

    public Price price() {
        return price;
    }

}
