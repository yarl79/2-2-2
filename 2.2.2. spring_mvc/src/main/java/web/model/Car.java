package web.model;

public class Car {
    private final String manufacturer;
    private final String model;
    private final int number;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public Car(String manufacturer, String model, int number) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.number = number;
    }

    @Override
    public String toString() {
        return "car " + manufacturer + " " + model + " " + number +", ";
    }
}
