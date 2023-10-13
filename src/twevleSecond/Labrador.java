package twevleSecond;

public class Labrador extends Dog {
    public Labrador(String name, int age) {
        super(name, age, "Labrador");
    }

    @Override
    public void bark() {
        System.out.println("Barking like a Labrador");
    }
}