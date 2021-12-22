package Payment;

import Payment.events.PaymentMethodAdded;
import Payment.events.SentToAccountability;
import Payment.events.TotalPriceObtained;
import Payment.values.Methods;
import Payment.values.PaymentID;
import Store.events.ConsoleAdded;
import Store.values.Price;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Set;

public class Payment extends AggregateEvent<PaymentID> {

    protected Set<PaymentMethod> paymentMethods;
    protected Set<Accountability> accountabilities;

    public Payment(PaymentID entityId) {

        super(entityId);
        subscribe(new PaymentChange(this));
    }

    public void addPaymentMethod(PaymentID paymentID, Methods methods, Price price){

        Objects.requireNonNull(paymentID);
        Objects.requireNonNull(methods);
        Objects.requireNonNull(price);

        appendChange(new PaymentMethodAdded(paymentID, methods, price)).apply();

    }

    public void addAccountability(PaymentID paymentID){

        Objects.requireNonNull(paymentID);

        appendChange(new SentToAccountability(paymentID)).apply();

    }

    public void obtainTotalPrice(Price price){

        Objects.requireNonNull(price);

        appendChange(new TotalPriceObtained(price)).apply();
    }






}
