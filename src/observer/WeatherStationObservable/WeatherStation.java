package observer.WeatherStationObservable;

/**
 * @author LiuYang
 * @date 2020/4/9
 */


import observer.WeatherStationObservable.CurrentConditionsDisplay;

/**
 * 自定义观察者模式
 */
public class WeatherStation {
    public static void main(String[] args) {
        //建立一个WeatherData对象(主题对象)
        WeatherData weatherData=new WeatherData();

        //CcurrentConditionsDisplay通过对象初始化注册成为观察者
        CurrentConditionsDisplay ccurrentConditionsDisplay=new CurrentConditionsDisplay(weatherData);

//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        //值改变了
        weatherData.setMeasurements(80,60,55);


    }
}
