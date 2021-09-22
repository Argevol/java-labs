package Lab1.task11;

import java.util.Arrays;
import java.util.Objects;

public class Client {
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private Order[] orders;

    public Client(final String name, final String surname, final int age, final String phoneNumber, final Order[] orders) {
        this.name = name;
        this.surname = surname;
        setAge(age);
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
        if (age >= 18)
            return age;
        else
            throw new ArithmeticException("Age must be 18!");
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(final Order[] orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(phoneNumber, client.phoneNumber) && Arrays.equals(orders, client.orders);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, age, phoneNumber);
        result = 31 * result + Arrays.hashCode(orders);
        return result;
    }
}
