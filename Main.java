package ShopMyInterface;


public class Main {


    /**
     * I own a supermarket and I want to calculate the total regular price and the total sales price of a bunch of goods.
     * They includes Tvs, Mp3s, Cartoon books, Thrillers.
     *
     * @param args
     */
    public static void main(String[] args) {
//        Thriller tl1 = new Thriller(15, 8, 1987, "Pee Wee press", 0.9);
//        Cartoon ct1 = new Cartoon("Batman", 14, 1924, "Pee Wee press", 0.9);
//        TV tv1 = new TV(1000, "Samsung", 30, 0.9);
//        TV tv2 = new TV(2000, "Sony", 50, 0.9);
//        MP3 mp3 = new MP3("blue", "Apple", 250, 0.9);

        // Compute total regular price and total sale price.
//        double totalRegularPrice = tl1.getRegularPrice() + ct1.getRegularPrice() + tv1.getRegularPrice() + tv2.getRegularPrice() + mp3.getRegularPrice();
//        double totalSalePrice = tl1.getSalesPrice() + ct1.getSalesPrice() + tv1.getSalesPrice() + tv2.getSalesPrice() + mp3.getSalesPrice();
//        System.out.println("Total Regular Price is $" + totalRegularPrice + ".");
//        System.out.println("Total Sales Price is $" + totalSalePrice + ".");

        // what if there are thousands of stuff in the supermarket cart?
        // The first way is to construct Objects in a inheritance tree. (we did this last lab)
        // The second way is to add interface to Class (main content of this lab with polymorphism)


        Product[] products = new Product[15];
        products[0] = new Cartoon("Batman", 14, 1924, "Pee Wee press", 0.9);
        products[1] = new Cartoon("Batman", 15, 1934, "Pee Wee press", 0.8);
        products[2] = new Cartoon("Batman", 16, 1944, "Pee Wee press", 0.6);
        products[3] = new Cartoon("Batman", 17, 1954, "Pee Wee press", 0.7);
        products[4] = new Cartoon("Batman", 18, 1964, "Pee Wee press", 0.1);
        products[5] = new TV(1000, "Samsung", 2000, 0.95);
        products[6] = new TV(500, "Samsung", 1000, 0.93);
        products[7] = new TV(800, "Samsung", 500, 0.94);
        products[8] = new Thriller(15, 8, 1987, "Pee Wee press", 0.9);
        products[9] = new Thriller(10, 20, 1989, "Pee Wee press", 0.8);
        products[10] = new Thriller(2, 15, 1988, "Pee Wee press", 0.5);
        products[11] = new Thriller(1, 10, 1988, "Pee Wee press", 0.4);
        products[12] = new MP3("blue", "Apple", 251, 0.9);
        products[13] = new MP3("red", "Apple", 252, 0.9);
        products[14] = new MP3("black", "Apple", 253, 0.9);


        // inheritance tree
        double totalSalesPrice = 0;
        int totalRegularPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof Electronic) {
                totalRegularPrice += products[i].getRegularPrice();
                totalSalesPrice += products[i].getSalesPrice();
                System.out.println(((Electronic) products[i]).getManufacturer());
            }
        }

        System.out.println("Total Regular Price is $" + totalRegularPrice + ".");
        System.out.println("Total Sales Price is $" + totalSalesPrice + ".");


        // In second way, we may still need inheritance tree, when we ask
        // 1. how to represent other kind of books?
        // 2. What if I want to calculate the total regular prices/sales price for all books?
        // 3. What if I want to calculate the total regular prices/sales price for all electronics?
        // 4. What if I want to calculate the total regular prices/sales price for all products?


        // Do you see the difference between interface and inheritance?
        // hierarchy and non-hierarchy
        // hierarchy: go to difference levels and do level-specific operations
        // non-hierarchy: based on behaviour features to do interface-specific operations even across different inheritance tree
    }
}
