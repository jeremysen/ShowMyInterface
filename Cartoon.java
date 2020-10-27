package ShopMyInterface;

public class Cartoon extends Product {
    private String characterName;
    private int yearPublished;
    private String publisher;

    public Cartoon(String characterName, int regularPrice, int yearPublished, String publisher, double discount) {
        super(regularPrice, discount);
        this.characterName = characterName;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
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