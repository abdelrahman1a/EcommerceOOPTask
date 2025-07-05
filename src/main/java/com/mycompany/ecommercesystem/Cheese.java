
package com.mycompany.ecommercesystem;
import java.util.Date;

public class Cheese extends ExpirableProduct implements IShippable {
    private double weight;

    public Cheese(String name, double price, int quantity, Date expirationDate, double weight) {
        super(name, price, quantity, expirationDate);
        this.weight = weight;
    }

    @Override
    public double getWeight(){
        return weight;
    }
}