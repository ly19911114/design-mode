package observer.WeatherStation;

/**
 * @author LiuYang
 * @date 2020/4/9
 */

import java.util.ArrayList;

/**
 * 实现主题接口，为主题
 */
public class WeatherData implements Subject {
    //加上一个ArrayList来记录观察者，此ArrayList是在构造器中建立
    private ArrayList observers;
    //三个数据
    private float temperature;
    private float humdity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumdity() {
        return humdity;
    }

    public float getPressure() {
        return pressure;
    }

    //构造函数
    public WeatherData() {
        observers = new ArrayList();
    }


    /**
     * 观察者注册
     *
     * @param observer 观察者变量
     */
    @Override
    public void registerObserver(Observer observer) {
        //当注册观察者时，我们只要把它加到ArrayList的后面即可
        observers.add(observer);
    }

    /**
     * 观察者删除
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        //IndexOf方法将会返回符合条件的第一个元素在集合中的索引位置信息，如果未查到符合条件的元素对象，则返回-1。
        int i = observers.indexOf(observer);
        if (i > 0) {
            observers.remove(i);
        }
    }

    /**
     * 在这里，我们把状态告诉每一个观察者，因为观察者都实现了update()方法，所以我们知道如何通知他们
     */
    @Override
    public void notifyObservers() {
     for (int i=0;i<observers.size();i++){
         Observer observer=(Observer) observers.get(i);
         observer.update(temperature,humdity,pressure);
     }
    }

    /**
     * 当从气象站得到更新观测值时，通知观察者
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humdity,float pressure){
        this.temperature=temperature;
        this.humdity=humdity;
        this.pressure=pressure;
        measurementsChanged();
    }


}
