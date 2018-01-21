package headfirst.patterns.observer;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-21
 */
public class CurrentConditionDisplay implements Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "C degree and " + humidity + "% humidity");
    }

}
