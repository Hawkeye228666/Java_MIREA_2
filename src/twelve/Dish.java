package twelve;

public abstract class Dish {
    private String material;
    private String color;
    private double price;

    public Dish(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void use();

    @Override
    public String toString() {
        return "Dish made of " + material + " with color " + color + " and price " + price;
    }
}