package services;
import interfaces.Shippable;
import models.Cart;
import models.Customer;

import java.util.Map;

public class CheckoutService {

    public static void checkout(Customer customer, Cart cart){

        if(cart.isEmpty()){
            throw new IllegalStateException("The cart is empty");
        }

        CheckExpirationDate.check(cart.getCartItems());

        double subtotal = cart.getSubTotal();

        CalculationsForShippableProducts.calc(cart.getCartItems());
        double totalWeight = CalculationsForShippableProducts.getTotalWeight();
        Map<Shippable, Integer> shippableItems = CalculationsForShippableProducts.getShippableItems();
        double shippingFee = CalculationsForShippableProducts.getShippingFee();

        double total = subtotal + shippingFee;

        CheckCustomerBalanceService.check(customer, total);

        customer.reduceBalance(total);
        PrintShipmentNotice.print(shippableItems , totalWeight);

        PrintCheckoutReceipt.print(cart.getCartItems(),subtotal,shippingFee,total);

    }
}
