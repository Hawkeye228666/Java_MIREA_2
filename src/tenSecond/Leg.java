package tenSecond;

public class Leg {
    private double legLength;
    private double footSize;

    public Leg(double legLength, double footSize) {
        this.legLength = legLength;
        this.footSize = footSize;
    }

    public double getLegLength() {
        return legLength;
    }

    public void setLegLength(double legLength) {
        this.legLength = legLength;
    }

    public double getFootSize() {
        return footSize;
    }

    public void setFootSize(double footSize) {
        this.footSize = footSize;
    }
}