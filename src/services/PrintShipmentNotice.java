package services;

import interfaces.Shippable;
import models.Product;

import java.util.Map;

public class PrintShipmentNotice {
    public static void print(Map<Shippable,Integer> items , double totalWeight){
        if(items.isEmpty()) return;

        System.out.println("** Shipment notice **");

        for(Map.Entry<Shippable,Integer> item : items.entrySet()){
            String name = ((Product)item.getKey()).getName();
            int quantity = item.getValue();
            System.out.println(quantity + "x " + name+"     "+item.getKey().getWeight() * quantity+"g");
        }

        System.out.println("Total package weight "+totalWeight+"kg");
        System.out.println();
    }
}
