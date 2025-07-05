
package com.mycompany.ecommercesystem;
import java.util.Date;

public class Biscuits extends ExpirableProduct implements IShippable {
    private double weight;

    public Biscuits(String name, double price, int quantity, Date expirationDate, double weight) {
        super(name, price, quantity, expirationDate);
        this.weight = weight;
    }

    @Override
    public double getWeight() { return weight; }
}