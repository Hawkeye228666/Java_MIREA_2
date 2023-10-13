package twelve;
//Создать абстрактный класс, описывающий посуду(Dish). С помощью наследования реализовать различные виды посуды,
// имеющие свои свойства и методы. Протестировать работу классов.
public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate("ceramic", "white", 10.99, 20);
        System.out.println(plate);
        plate.use();

        Cup cup = new Cup("glass", "clear", 5.99, 250);
        System.out.println(cup);
        cup.use();
    }
}