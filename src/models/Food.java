package models;

import interfaces.Expirable;
import interfaces.Shippable;

import java.time.LocalDate;

public class Food extends Product implements Shippable, Expirable {
    private LocalDate expiryDate;
    private double weight;

    public Food(String name, int quantity, double price , LocalDate expiryDate , double weight) {
        super(name, quantity, price);
        this.expiryDate = expiryDate;
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }
}
