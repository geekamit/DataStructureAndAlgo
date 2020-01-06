package chapter2.p41;

import java.awt.*;
import java.util.Objects;

public class NewCar {
    private final String name;
    private final Color color;

    public NewCar(String name, Color color) {
        this.name = Objects.requireNonNull(name, "Car name can not be null");
        this.color = Objects.requireNonNull(color, "Car Color cannot be null");
    }

    public void assignDriver(String license, Point location){
        Objects.requireNonNull(license, "Driver License Cannot be null");
        Objects.requireNonNull(location, "Location cannot be null");
    }
}
