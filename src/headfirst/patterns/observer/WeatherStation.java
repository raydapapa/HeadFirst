package headfirst.patterns.observer;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-21
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(26, 65, 30.4f);
        weatherData.setMeasurements(8, 50, 31.4f);
        weatherData.setMeasurements(40, 55, 32.4f);
    }
}
