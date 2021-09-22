package Lab1.task10;

import jdk.jfr.Percentage;

import java.util.Objects;

public class Day {
    private Weather weather = new Weather();
    private String nameOfDay;

    public Day(final int temperature, final String typeOfWeather, final int humidity, final int speedOfWind, final int atmosphericPressure, final String nameOfDay) {
        this.weather.setTemperature(temperature);
        this.weather.setTypeOfWeather(typeOfWeather);
        this.weather.setHumidity(humidity);
        this.weather.setSpeedOfWind(speedOfWind);
        this.weather.setAtmosphericPressure(atmosphericPressure);
        this.nameOfDay = nameOfDay;
    }

    public Weather getWeather() {
        return weather;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Day day = (Day) o;
        return Objects.equals(weather, day.weather) && Objects.equals(nameOfDay, day.nameOfDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weather, nameOfDay);
    }

    @Override
    public String toString() {
        return "Name of day: " + getNameOfDay() + '\n' +
                getWeather().toString() + '\n';
    }
}

