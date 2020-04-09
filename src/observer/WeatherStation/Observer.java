package observer.WeatherStation;

/**
 * @author LiuYang
 * @date 2020/4/9
 */
//观察者接口
public interface Observer {
    //所有的观察者都必须实现update方法
   void update(float temperature,float humidity,float pressure);
}
