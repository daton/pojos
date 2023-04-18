package educarvr.pojos.shop;

import educarvr.pojos.shop.Product;

public class Battery extends Product {

    private boolean rechargeable;

    public Battery() {
        super();
    }

    public Battery(String name, double price) {
        super(name, price);
    }

    public boolean getRechargeable() {
        return rechargeable;
    }

    // Getters and Setters
    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}
