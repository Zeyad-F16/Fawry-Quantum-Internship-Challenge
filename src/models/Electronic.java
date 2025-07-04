package models;

import interfaces.Shippable;

public class Electronic extends Product implements Shippable {

    private double weight;

    public Electronic(String name, int quantity, double price , double weight) {
        super(name, quantity, price);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
