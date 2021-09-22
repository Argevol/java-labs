package Lab1.task11;

import java.util.Arrays;
import java.util.Objects;

public class Taxi {
    private String typeOfCar;
    private int capacity;
    private boolean isHasBabySeat;
    private Driver[] driver;

    public Taxi(final String typeOfCar, final int capacity, final boolean isHasBabySeat, final Driver[] driver) {
        this.typeOfCar = typeOfCar;
        this.capacity = capacity;
        this.isHasBabySeat = isHasBabySeat;
        this.driver = driver;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(final String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(final int capacity) {
        if (capacity >= 2)
            this.capacity = capacity;
        else {
            throw new ArithmeticException("Taxi must have at least 2 seats!");
        }
    }

    public boolean isHasBabySeat() {
        return isHasBabySeat;
    }

    public void setHasBabySeat(final boolean isHasBabySeat) {
        this.isHasBabySeat = isHasBabySeat;
    }

    public Driver[] getDriver() {
        return driver;
    }

    public void setDriver(final Driver[] driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Taxi taxi = (Taxi) o;

        return capacity == taxi.capacity && isHasBabySeat == taxi.isHasBabySeat && Objects.equals(typeOfCar, taxi.typeOfCar) && Arrays.equals(driver, taxi.driver);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(typeOfCar, capacity, isHasBabySeat);
        result = 31 * result + Arrays.hashCode(driver);
        return result;
    }

    @Override
    public String toString() {
        return "Type of Car: " + typeOfCar + '\n' +
                "Capacity: " + capacity + '\n' +
                "Does the car has baby seat?: " + isHasBabySeat + '\n' +
                "Drivers " + '\n' + Arrays.toString(driver);
    }
}
