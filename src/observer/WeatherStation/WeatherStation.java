package observer.WeatherStation;

/**
 * @author LiuYang
 * @date 2020/4/9
 */
public class WeatherStation {
    public static void main(String[] args) {
        //建立一个WeatherData对象
        WeatherData weatherData=new WeatherData();

        CcurrentConditionsDisplay ccurrentConditionsDisplay=new CcurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,60,55);
    }
}
