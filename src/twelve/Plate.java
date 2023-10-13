package twelve;

public class Plate extends Dish {
    private int diameter;

    public Plate(String material, String color, double price, int diameter) {
        super(material, color, price);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void use() {
        System.out.println("Using a plate to eat food");
    }

    @Override
    public String toString() {
        return "Plate with diameter " + diameter + ", " + super.toString();
    }
}
