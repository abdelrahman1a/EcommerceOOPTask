
package com.mycompany.ecommercesystem;
import java.util.*;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void add(Product product, int quantity) throws Exception {
        if (!product.isAvailable(quantity)) 
            throw new Exception("Not enough stock");
        items.add(new CartItem(product, quantity));
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public List<CartItem> getItems() {
        return items;
    }
}