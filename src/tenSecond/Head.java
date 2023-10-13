package tenSecond;

public class Head {
    private String hairColor;
    private double headSize;

    public Head(String hairColor, double headSize) {
        this.hairColor = hairColor;
        this.headSize = headSize;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public double getHeadSize() {
        return headSize;
    }

    public void setHeadSize(double headSize) {
        this.headSize = headSize;
    }
}

