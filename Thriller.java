package ShopMyInterface;

public class Thriller extends Product {
    private int level;
    private int yearPublished;
    private String publisher;

    public Thriller(int level, int regularPrice, int yearPublished, String publisher, double discount) {
        super(regularPrice, discount);
        this.level = level;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
