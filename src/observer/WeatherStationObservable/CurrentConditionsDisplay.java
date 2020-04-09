package observer.WeatherStationObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author LiuYang
 * @date 2020/4/9
 */
public class CurrentConditionsDisplay implements Observer, DispalyElement {

    Observable observable;
    private float temperature;
    private float humidity;

    /**
     * 需要Observable当参数，并将CurrentConditionsDisplay对象登记成为观察者
     *
     * @param observable
     */
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    //观察者拉取需要的信息
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumdity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditionss: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
