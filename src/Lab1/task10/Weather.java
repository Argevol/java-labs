package Lab1.task10;

import java.util.Objects;

public class Weather {
    private int temperature;
    private String typeOfWeather;
    private int humidity;
    private int speedOfWind;
    private int atmosphericPressure;

    public Weather() {
        this.temperature = 0;
        this.typeOfWeather = "Sunny";
        this.humidity = 25;
        this.speedOfWind = 0;
        this.atmosphericPressure = 760;
    }

    public Weather(final int temperature, final String typeOfWeather, final int humidity, final int speedOfWind, final int atmosphericPressure) {
        this.temperature = temperature;
        this.typeOfWeather = typeOfWeather;
        this.humidity = humidity;
        this.speedOfWind = speedOfWind;
        this.atmosphericPressure = atmosphericPressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getTypeOfWeather() {
        return typeOfWeather;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getSpeedOfWind() {
        return speedOfWind;
    }

    public int getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void setTemperature(final int temperature) {
        this.temperature = temperature;
    }

    public void setTypeOfWeather(final String typeOfWeather) {
        this.typeOfWeather = typeOfWeather;
    }

    public void setHumidity(final int humidity) {
        this.humidity = humidity;
    }

    public void setSpeedOfWind(final int speedOfWind) {
        this.speedOfWind = speedOfWind;
    }

    public void setAtmosphericPressure(final int atmosphericPressure) {
        this.atmosphericPressure = atmosphericPressure;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Weather weather = (Weather) o;
        return temperature == weather.temperature && humidity == weather.humidity && speedOfWind == weather.speedOfWind && atmosphericPressure == weather.atmosphericPressure && Objects.equals(typeOfWeather, weather.typeOfWeather);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature, typeOfWeather, humidity, speedOfWind, atmosphericPressure);
    }

    @Override
    public String toString() {
        return "temperature: " + getTemperature() + '\n' +
                "type of weather: " + getTypeOfWeather() + '\n' +
                "humidity %: " + getHumidity() + '\n' +
                "speed of wind m/s: " + getSpeedOfWind() + '\n' +
                "atmospheric pressure: " + getAtmosphericPressure();
    }
}