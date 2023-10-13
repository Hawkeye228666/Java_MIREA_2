package f;
//Реализовать интерфейс Priceable, имеющий метод getPrice(), возвращающий некоторую цену для объекта.
// Проверить работу для различных классов, сущности которых могут иметь цену.
import f.Book;
import f.Laptop;
import f.Phone;
import f.Priceable;

public class Price {
    public static void main(String[] args) {
        Priceable book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 19.99);
        System.out.println("The price of " + book.getClass().getSimpleName() + " is $" + book.getPrice());

        Priceable phone = new Phone("Samsung", "Galaxy S21", 999.99);
        System.out.println("The price of " + phone.getClass().getSimpleName() + " is $" + phone.getPrice());

        Priceable laptop = new Laptop("Apple", "MacBook Pro", 1499.99);
        System.out.println("The price of " + laptop.getClass().getSimpleName() + " is $" + laptop.getPrice());
    }
}
