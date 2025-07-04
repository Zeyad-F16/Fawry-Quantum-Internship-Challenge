package services;

import interfaces.Expirable;
import models.CartItem;
import models.Product;

import java.util.List;

public class CheckExpirationDate {
    public static void check(List<CartItem> items){
        for(CartItem item : items) {
            Product p = item.getProduct();

            if (p instanceof Expirable expirable && expirable.isExpired()) {
                throw new IllegalStateException("The product is expired");
            }
        }
    }
}
