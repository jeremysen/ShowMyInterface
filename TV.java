package ShopMyInterface;

public class TV extends Electronic {
    private int size;

    public TV(int size, String manufacturer, int regularPrice, double discount) {
        super(manufacturer, regularPrice, discount);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
