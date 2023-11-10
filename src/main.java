package thirteen;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void func() {
        try {
            FileWriter writer = new FileWriter("file.txt");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст для записи в файл:");
            String text = scanner.nextLine();
            writer.write(text);
            writer.close();
            System.out.println("Текст успешно записан в файл!");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
    public static void  secondFunc() {
        try {
            FileWriter writer = new FileWriter("file.txt");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите новый текст для записи в файл:");
            String text = scanner.nextLine();
            writer.write(text);
            writer.close();
            System.out.println("Текст успешно заменен в файле!");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
    public static void  thirdFunc() {
        try {
            FileWriter writer = new FileWriter("file.txt", true);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст для добавления в файл:");
            String text = scanner.nextLine();
            writer.write(text);
            writer.close();
            System.out.println("Текст успешно добавлен в файл!");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
    public static void fourthFunc() {
        try {
            FileReader reader = new FileReader("file.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

    }
    public static void main(String[] args) {
        thirdFunc();
    }
}

