package observer.WeatherStation;

/**
 * @author LiuYang
 * @date 2020/4/9
 */

/**
 * 自定义观察者模式
 */
public class WeatherStation {
    public static void main(String[] args) {
        //建立一个WeatherData对象(主题对象)
        WeatherData weatherData=new WeatherData();

        //CcurrentConditionsDisplay通过对象初始化注册成为观察者
        CcurrentConditionsDisplay ccurrentConditionsDisplay=new CcurrentConditionsDisplay(weatherData);
        //值改变了
        weatherData.setMeasurements(80,60,55);
    }
}
