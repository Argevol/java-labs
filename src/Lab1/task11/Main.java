package Lab1.task11;

public class Main {
    public static void main(final String[] args) {
        final Driver[] drivers = new Driver[3];

        drivers[0] = new Driver("Stepan", "Bandera");
        drivers[1] = new Driver("Ivan", "Franko");
        drivers[2] = new Driver("Taras", "Shevchenko");

        final Taxi taxiCar = new Taxi("Toyota", 5, true, drivers);

        System.out.println(taxiCar);
    }
}
