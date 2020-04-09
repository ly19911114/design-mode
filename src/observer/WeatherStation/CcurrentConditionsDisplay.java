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
     * @param weatherData
     */
    public CcurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
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
