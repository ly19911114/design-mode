package observer.WeatherStationObservable;

import java.util.Observable;

/**
 * @author LiuYang
 * @date 2020/4/9
 */

/**
 * 与自定义的观察者模式相比，我们不再需要追踪观察者了，也不需要管理注册和删除，让超类Observable代劳即可
 * 用JDK自带的观察者模式创建
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humdity;
    private float pressure;


    /**
     * 因为我们要是用“拉”的做法，所以才提醒你有这些方法，观察者会利用这些get方法获取得到WeatherData对象的状态，而不是通过主题的推送
     * 在自定义观察者模式虽然也定义了这些get方法，但是没有用到
     * @return
     */
    public float getTemperature() {
        return temperature;
    }

    public float getHumdity() {
        return humdity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeatherData(){

    }

    public void measurementsChanged(){
        //在调用notifyObservers()之前，要先调用serChanged()来指示状态已经改变
        setChanged();
        //观察者拉取数据
        notifyObservers();
        //主题主动推送数据
//        notifyObservers();
    }

    public void setMeasurements(float temperature,float humdity,float pressure){
        this.temperature=temperature;
        this.humdity=humdity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
