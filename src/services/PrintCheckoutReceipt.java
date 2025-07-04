package services;

import models.CartItem;

import java.util.List;

class PrintCheckoutReceipt {
    public static void print(List<CartItem> items, double subtotal, double shippingFee, double total) {
        System.out.println("** Checkout receipt **");
        for(CartItem item : items){
            System.out.println(item.getQuantity() +"x "+ item.getProduct().getName() +"     "+item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.println("Subtotal        "+subtotal);
        System.out.println("Shipping        "+shippingFee);
        System.out.println("Amount           "+total);
    }
}