package OOP;

import java.time.LocalDate;

public class Car {
    private String name;
    private int price;
    private int speed;
    private LocalDate manufactoryDate;

    public Car(String name, int price, int speed, LocalDate localDate) {
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.manufactoryDate = localDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setManufactoryDate(LocalDate manufactoryDate) {
        this.manufactoryDate = manufactoryDate;
    }

    public LocalDate getManufactoryDate() {
        return manufactoryDate;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car jentra = new Car("Jentra", 120000000, 200, LocalDate.of(2015, 7, 17));
        Car cobalt = new Car("Cobalt", 80000000, 220, LocalDate.of(2016, 5, 12));
        jentra.setManufactoryDate(LocalDate.of(2022, 4, 11));
        jentra.setPrice(170000000);
        System.out.println("Name:" + jentra.getName() + ", ManufactoryDate: " + jentra.getManufactoryDate() +
                ", Speed:" + jentra.getSpeed() + ", Price:" + jentra.getPrice());

        cobalt.setManufactoryDate(LocalDate.of(2022, 5, 4));
        cobalt.setPrice(140000000);
        System.out.println("Name:" + cobalt.getName() + ", ManufactoryDate:" + cobalt.getManufactoryDate() +
                ", Price:" + cobalt.getPrice() + ", Speed: " + cobalt.getSpeed());
    }
}
