package Lab1.task11;

import java.util.Objects;

public class Order {
    private int orderNumber;
    private int price;
    private int countOfPassengers;
    private Taxi taxiCar;
    private Client client;

    public Order(final int orderNumber, final int price, final int countOfPassengers, final Taxi taxiCar, final Client client) {
        this.orderNumber = orderNumber;
        this.price = price;
        this.countOfPassengers = countOfPassengers;
        this.taxiCar = taxiCar;
        this.client = client;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(final int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(final int countOfPassengers) {
        if(countOfPassengers == taxiCar.getCapacity() && taxiCar.getCapacity() >= 2)
        this.countOfPassengers = countOfPassengers;
        else
            throw new ArithmeticException("There is only " + taxiCar.getCapacity() + "seats");
    }

    public Taxi getTaxiCar() {
        return taxiCar;
    }

    public void setTaxiCar(final Taxi taxiCar) {
        this.taxiCar = taxiCar;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(final Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Order order = (Order) o;
        return orderNumber == order.orderNumber && price == order.price && countOfPassengers == order.countOfPassengers && Objects.equals(taxiCar, order.taxiCar) && Objects.equals(client, order.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, price, countOfPassengers, taxiCar, client);
    }
}
