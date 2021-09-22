package Lab1.task11;

import java.util.Objects;

public class Driver {
    private String name;
    private String surname;

    public Driver(final String name, final String surname) {
        this.name = name;
        this.surname = surname;
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Driver driver = (Driver) o;
        return Objects.equals(name, driver.name) && Objects.equals(surname, driver.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + '\n' +
                "Surname: " + this.getSurname() + '\n';
    }
}
