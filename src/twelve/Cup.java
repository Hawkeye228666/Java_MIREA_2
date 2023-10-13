package twelve;

public class Cup extends Dish {
    private int volume;

    public Cup(String material, String color, double price, int volume) {
        super(material, color, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void use() {
        System.out.println("Using a cup to drink a beverage");
    }

    @Override
    public String toString() {
        return "Cup with volume " + volume + ", " + super.toString();
    }
}

