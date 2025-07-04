package models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void add(Product product , int quantity){
        if(product.getQuantity() < quantity){
            throw new IllegalArgumentException("The quantity you need is more than the available quantity");
        }
        items.add(new CartItem(product,quantity));
        product.reduceQuantity(quantity);
    }

    public List<CartItem> getCartItems(){
        return items;
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public double getSubTotal(){
        double total = 0;
        for(CartItem item : items){
            total += item.getTotalPrice();
        }
        return total;
    }

}
