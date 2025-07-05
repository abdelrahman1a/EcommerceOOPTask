
package com.mycompany.ecommercesystem;

import java.util.*;

public class ShippingService {
    public static void process(List<IShippable> items) {
        if (items.isEmpty()) return;
        System.out.println("\n** Shipment notice **");
        double totalWeight = 0;
        Map<String, Integer> countMap = new LinkedHashMap<>();

        for (IShippable item : items) {
            countMap.put(item.getName(), countMap.getOrDefault(item.getName(), 0) + 1);
            totalWeight += item.getWeight();
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getValue() + "x " + entry.getKey());
        }

        System.out.println("Total package weight: " + totalWeight + "kg");
    }
}