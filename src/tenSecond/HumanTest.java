package tenSecond;
// Создать класс, описывающий тело человека(Human). Для описания каждой части тела создать отдельные классы(Head, Leg, Hand).
//Описать необходимые свойства и методы для каждого класса. Протестировать работу класса Human.
public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Brown", 56.2);
        Leg leftLeg = new Leg(80.5, 9.5);
        Leg rightLeg = new Leg(81.0, 9.5);
        Hand leftHand = new Hand(70.0, true);
        Hand rightHand = new Hand(72.0, true);

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        System.out.println("Head hair color: " + human.getHead().getHairColor());
        System.out.println("Head size: " + human.getHead().getHeadSize());

        System.out.println("Left leg length: " + human.getLeftLeg().getLegLength());
        System.out.println("Left foot size: " + human.getLeftLeg().getFootSize());

        System.out.println("Right leg length: " + human.getRightLeg().getLegLength());
        System.out.println("Right foot size: " + human.getRightLeg().getFootSize());

        System.out.println("Left hand arm length: " + human.getLeftHand().getArmLength());
        System.out.println("Left hand has fingers: " + human.getLeftHand().isHasFingers());

        System.out.println("Right hand arm length: " + human.getRightHand().getArmLength());
        System.out.println("Right hand has fingers: " + human.getRightHand().isHasFingers());
    }
}