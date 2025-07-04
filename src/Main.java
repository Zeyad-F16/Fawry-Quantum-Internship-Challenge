import models.*;
import services.CheckoutService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Product apple = new Food("Apple", 5, 10, LocalDate.now().plusDays(5),20);
        Product laptop = new Electronic("Laptop", 5, 5000, 2500);
        Product  scratchCard = new Digital("scratch card", 50, 10);

        Customer customer = new Customer("Zeyad Emam", 20000);

        Cart cart = new Cart();
        cart.add(apple, 4);
        cart.add(laptop, 1);
        cart.add(scratchCard, 1);

        CheckoutService.checkout(customer, cart);
    }
}