package ironhack.classes.automobiles;

public abstract class Car {
    private int vinNumber;
    private String make;
    private String model;
    private int mileage;

//    Suppose you are building a Car inventory system.
//    All cars have a `vinNumber`, `make`, `model`, and `mileage`.
//    But no Car is just a Car. Each Car is either a Sedan, a UtilityVehicle, or a Truck.
//    UtilityVehicles have a boolean that respresents whether they have `fourWheelDrive`.
//    Trucks have a numeric `towingCapacity`.


    public Car(int vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
