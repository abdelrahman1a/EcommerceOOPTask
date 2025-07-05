
package com.mycompany.ecommercesystem;

import java.util.*;

public class Customer {
    String name;
    double balance;
    Cart cart = new Cart();

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void checkout()
            throws Exception {
        if (cart.isEmpty()) 
            throw new Exception("Cart is empty");

        double subtotal = 0;
        double shippingTotal = 0;
        List<IShippable> shippables = new ArrayList<>();

        for (CartItem item : cart.getItems()) {
            Product product = item.product;
            int quantity = item.quantity;

            if (product.isExpired()) throw new Exception(product.getName() + " is expired");
            if (!product.isAvailable(quantity)) throw new Exception(product.getName() + " is out of stock");

            subtotal += product.getPrice() * quantity;
            product.reduceQuantity(quantity);

            if (product instanceof IShippable) {
                for (int i = 0; i < quantity; i++) shippables.add((IShippable) product);
                shippingTotal += ((IShippable) product).getWeight() * quantity * 10; // $10/kg
            }
        }

        double total = subtotal + shippingTotal;
        if (balance < total) throw new Exception("Insufficient balance");

        balance -= total;
        ShippingService.process(shippables);

        System.out.println("\n** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.println(item.quantity + "x " + item.product.getName() + "\t" + (item.getTotalPrice()));
        }
        System.out.println("------------------------");
        System.out.println("Subtotal\t" + subtotal);
        System.out.println("Shipping\t" + shippingTotal);
        System.out.println("Amount\t" + total);
        System.out.println("Balance left\t" + balance);
    }
}