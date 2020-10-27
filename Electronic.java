package ShopMyInterface;

public class Electronic extends Product {

    private String manufacturer;

    public Electronic(String manufacturer, int regularPrice, double discount) {
        super(regularPrice, discount);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
