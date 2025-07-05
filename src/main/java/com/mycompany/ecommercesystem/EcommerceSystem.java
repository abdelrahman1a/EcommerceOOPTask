
package com.mycompany.ecommercesystem;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EcommerceSystem {

    public static void main(String[] args) {
        try {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, 5); // Not expired
            Date futureDate = cal.getTime();
            
            Cheese cheese = new Cheese("Cheese", 100, 10, futureDate, 0.4);
            Biscuits biscuits = new Biscuits("Biscuits", 150, 5, futureDate, 0.7);
            TV tv = new TV("TV", 3000, 3, 10);
            MobileScratchCard scratchCard = new MobileScratchCard("ScratchCard", 50, 20);
            
            Customer customer = new Customer("Ali", 1000);
            
        
                customer.cart.add(cheese, 3);
                 customer.cart.add(biscuits, 2);
            customer.cart.add(scratchCard, 1);
            
           
           
            
            
                customer.checkout();
            
        } 
         catch (Exception ex) {
            Logger.getLogger(EcommerceSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
