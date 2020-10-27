package ShopMyInterface;

public class Product implements ISalesPrice, IRegularPrice {
    private int regularPrice;
    private double salesPrice;

    public Product(int regularPrice, double discount) {
        this.regularPrice = regularPrice;
        this.salesPrice = this.computeSalesPrice(discount);
    }

    public void setRegularPrice(int regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Override
    public int getRegularPrice() {
        return regularPrice;
    }

    @Override
    public double getSalesPrice() {
        return salesPrice;
    }

    public double computeSalesPrice(double discount) {
        return this.regularPrice * discount;
    }
}
