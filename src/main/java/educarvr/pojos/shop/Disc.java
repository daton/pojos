package educarvr.pojos.shop;

import educarvr.pojos.shop.Product;

public class Disc extends Product {

    private int capacity;

    public Disc() {
        super();
    }

    public Disc(String name, double price) {
        super(name, price);
    }

    public int getCapacity() {
        return capacity;
    }

    // Getters and Setters
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
