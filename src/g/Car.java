package g;

class Car implements Nameable {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String getName() {
        return brand + " " + model;
    }
}