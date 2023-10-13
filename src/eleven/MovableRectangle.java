package eleven;
// Напишите новый класс MovableRectangle (движущийся прямоугольник).
// Его можно представить как две движущиеся точки MovablePoints
//(представляющих верхняя левая и нижняя правая точки) и реализующие интерфейс Movable.
// Убедитесь, что две точки имеет одну и ту же скорость (нужен метод это проверяющий).
public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        if (!checkSpeed()) {
            throw new IllegalArgumentException("Points have different speeds");
        }
    }

    public String toString() {
        return "Rectangle with top left at (" + topLeft.getX() + "," + topLeft.getY() + ") and bottom right at (" +
                bottomRight.getX() + "," + bottomRight.getY() + ") with speed (" + topLeft.getXSpeed() + "," +
                topLeft.getYSpeed() + ")";
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    private boolean checkSpeed() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed() && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }
}