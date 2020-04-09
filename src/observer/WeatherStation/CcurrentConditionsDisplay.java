package observer.WeatherStation;

/**
 * @author LiuYang
 * @date 2020/4/9
 */

/**
 * 现状布告板,实现了Observer接口，所以可以从WeatherData对象中获得改变
 * 也实现了DisplayElement,因为规定，观察者必须实现此接口，以展示具体的气象内容
 */
public class CcurrentConditionsDisplay implements Observer, DispalyElement {

    private float temperature;
    private float humidity;
    //主题接口变量
    private Subject weatherData;
//    private WeatherData weatherData;

    /**
     * 构造器需要weatherData对象(也就是主题)作注册之用
     *
     * @param weatherData 传入Subject的变量，其实传入的是主题对象，这么做的目的是为了松耦合
     */
    public CcurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        //任何时候我们都可以增加新的观察者，因为主题唯一依赖的东西是一个实现Observer接口的对象列表，
        //主题不需要知道观察者的具体类是谁、做了些什么或者其他任何细节
        //松耦合
        weatherData.registerObserver(this);
    }

    /**
     * 当update()被调用时，我们把温度和湿度都保存起来，然后调用display()
     * @param temperature
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
     this.temperature=temperature;
     this.humidity=humidity;
     display();
    }


    /**
     * 显示最近的温度和湿度
     */
    @Override
    public void display() {
        System.out.println("Current conditionss: "+temperature+"F degrees and "+humidity+"% humidity");
    }


}
