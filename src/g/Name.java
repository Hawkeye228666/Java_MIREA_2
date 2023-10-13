package g;
//Создать интерфейс Nameable, с методом getName(),
// возвращающим имя объекта, реализующего интерфейс.
//Проверить работу для различных объектов (например, можно создать классы,
// описывающие разные сущности, которые могут иметь имя: планеты, машины, животные и т. д.).
public class Name {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        System.out.println(planet.getName());

        Nameable car = new Car("Toyota", "Camry");
        System.out.println(car.getName());

        Nameable animal = new Animal("Max", "Dog");
        System.out.println(animal.getName());
    }
}