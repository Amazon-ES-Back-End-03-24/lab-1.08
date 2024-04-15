package ironhack.classes.automobiles;

public class Truck extends Car {
    private int towingCapacity;

    public Truck(int vinNumber, String make, String model, int mileage, int towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
