package UserControl;

import UserControl.values.Name;
import UserControl.values.Products;
import UserControl.values.SellerID;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Seller extends Entity<SellerID> {

    private Name name;
    private Products products;

    public Seller(SellerID entityId, Name name, Products products) {

        super(entityId);
    }

    public void updateProducts(Products products){
        this.products = Objects.requireNonNull(products);
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public Products products() {
        return products;
    }

    public Name name() {
        return name;
    }
}
