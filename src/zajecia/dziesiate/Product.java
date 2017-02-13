package zajecia.dziesiate;

import java.awt.geom.Arc2D;
import java.lang.reflect.Constructor;

/**
 * Created by RENT on 2017-02-13.
 */
public class Product {
    private String name;
    private String description;
    private double price;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + name + "," + description + "," + price + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
