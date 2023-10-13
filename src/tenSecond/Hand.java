package tenSecond;

public class Hand {
    private double armLength;
    private boolean hasFingers;

    public Hand(double armLength, boolean hasFingers) {
        this.armLength = armLength;
        this.hasFingers = hasFingers;
    }

    public double getArmLength() {
        return armLength;
    }

    public void setArmLength(double armLength) {
        this.armLength = armLength;
    }

    public boolean isHasFingers() {
        return hasFingers;
    }

    public void setHasFingers(boolean hasFingers) {
        this.hasFingers = hasFingers;
    }
}
