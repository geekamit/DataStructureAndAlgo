package chapter2.p41;

import java.awt.*;

public class OldCar {
    private final String name;
    private final Color color;

    public OldCar(String name, Color color) {
        if (name == null)
            throw new NullPointerException("Car name cannot be null");
        if (color == null)
            throw new NullPointerException("Color cannot be null");
        this.name = name;
        this.color = color;
    }

    public void assignDriver(String license, Point location){
        if (license == null)
            throw new NullPointerException("License cannot be null");
        if (location == null)
            throw new NullPointerException("Location cannot be null");

    }

}
