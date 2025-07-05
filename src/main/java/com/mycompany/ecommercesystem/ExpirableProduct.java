
package com.mycompany.ecommercesystem;
import java.util.Date;

public abstract class ExpirableProduct extends Product {
    protected Date expirationDate;

    public ExpirableProduct(String name, double price, int quantity, Date expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean isExpired() {
        return expirationDate.before(new Date());
    }
}