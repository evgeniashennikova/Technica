package guruqa;

public class Tablet {

    private String nameTablet;
    private String operatingSystemTablet;
    private double screenDiagonal;
    private int price;

    public String getNameTablet() {
        return nameTablet;
    }

    public void setNameTablet(String nameTablet) {
        this.nameTablet = nameTablet;
    }

    public String getOperatingSystemTablet() {
        return operatingSystemTablet;
    }

    public void setOperatingSystemTablet(String operatingSystemTablet) {
        this.operatingSystemTablet = operatingSystemTablet;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Характеристики планшета:" + nameTablet + "\n"
                + operatingSystemTablet + "\n"
                + screenDiagonal + "\n"
                + price + "руб."+ "\n";
    }

}
