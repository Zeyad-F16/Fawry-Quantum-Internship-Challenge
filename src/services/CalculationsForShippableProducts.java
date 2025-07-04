package services;

import interfaces.Shippable;
import models.CartItem;
import models.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculationsForShippableProducts {
    static final double SHIPPING_FEE_PER_KILO = 30; // EGP
    public static double totalWeight = 0;
    public static final Map<Shippable,Integer> shippableItems = new HashMap<>();

    public static void calc(List<CartItem> items){
        for(CartItem item : items){
            Product p = item.getProduct();

            if(p instanceof Shippable shippable){
                shippableItems.put(shippable,shippableItems.getOrDefault(shippable,0) + item.getQuantity());
                totalWeight += shippable.getWeight() * item.getQuantity();
            }
        }
    }

    public static double getTotalWeight(){
        return totalWeight;
    }

    public static Map<Shippable,Integer> getShippableItems(){
        return shippableItems;
    }

    public static double getShippingFee(){
        return (totalWeight/1000) * SHIPPING_FEE_PER_KILO;
    }

}
