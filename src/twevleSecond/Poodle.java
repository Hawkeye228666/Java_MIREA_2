package twevleSecond;

public class Poodle extends Dog {
    public Poodle(String name, int age) {
        super(name, age, "Poodle");
    }

    @Override
    public void bark() {
        System.out.println("Barking like a Poodle");
    }
}
