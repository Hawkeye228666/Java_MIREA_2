package f;

import f.Priceable;

class Phone implements Priceable {
    private String brand;
    private String model;
    private double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}