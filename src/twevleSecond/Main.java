package twevleSecond;
//Создать абстрактный класс, описывающий собак(Dog).
// С помощью наследования реализовать различные породы собак. Протестировать работу классов.
public class Main {
    public static void main(String[] args) {
        Labrador labrador = new Labrador("Max", 3);
        System.out.println(labrador);
        labrador.bark();

        Poodle poodle = new Poodle("Charlie", 5);
        System.out.println(poodle);
        poodle.bark();
    }
}