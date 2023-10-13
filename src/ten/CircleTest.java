package ten;
//Создать класс, описывающий модель окружности (Circle).
// В классе должны быть описаны нужные свойства окружности и методы для получения, изменения этих свойств.
//Протестировать работу класса в классе CircleTest, содержащим метод статический main(String[] args).
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5, 0, 0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Center X: " + circle.getCenterX());
        System.out.println("Center Y: " + circle.getCenterY());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        circle.setRadius(7);
        circle.setCenterX(2);
        circle.setCenterY(3);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Center X: " + circle.getCenterX());
        System.out.println("Center Y: " + circle.getCenterY());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}