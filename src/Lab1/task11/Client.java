package Lab1.task11;

import java.util.ArrayList;
import java.util.Objects;

public class Client {
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    ArrayList<Order> orders;

    public Client(final String name, final String surname, final int age, final String phoneNumber, final ArrayList<Order> orders) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age >= 18 ? age : 18;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(final ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void giveOrder(final Order order) {
        orders.add(order);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(phoneNumber, client.phoneNumber) && Objects.equals(orders, client.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, phoneNumber, orders);
    }
}
