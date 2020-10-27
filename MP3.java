package ShopMyInterface;

public class MP3 extends Electronic {
    private String color;

    public MP3(String color, String manufacturer, int regularPrice, double discount) {
        super(manufacturer, regularPrice, discount);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
