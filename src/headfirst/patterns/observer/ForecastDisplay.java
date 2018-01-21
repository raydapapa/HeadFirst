package headfirst.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-21
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Forecast: last pressure = " + lastPressure + ", current pressure = " + currentPressure);
    }
}
