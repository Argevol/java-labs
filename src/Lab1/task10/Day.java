package Lab1.task10;

import jdk.jfr.Percentage;

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
    public boolean equals(final Object obj) {
        if (obj == this) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        final Day day = (Day) obj;
        return (this.getNameOfDay() == day.getNameOfDay()
                || (this.getNameOfDay() != null && this.getNameOfDay().equals(day.getNameOfDay())));
    }

    @Override
    public int hashCode() {
        return this.getWeather().hashCode() + 31 * getNameOfDay().hashCode();
    }

    @Override
    public String toString() {
        return "Name of day: " + getNameOfDay() + '\n' +
                getWeather().toString() + '\n';
    }
}

