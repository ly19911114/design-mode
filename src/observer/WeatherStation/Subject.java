package observer.WeatherStation;

/**
 * @author LiuYang
 * @date 2020/4/9
 */

/**
 * 主题接口
 */
public interface Subject {
    /**
     * 这两个方法都需要一个观察者作为变量，该观察者是用来注册或是被删除的
     * @param observer 观察者变量
     */
    //注册观察者
    void registerObserver(Observer observer);
    //删除观察者
    void removeObserver(Observer observer);
    //当主题状态改变时，这个方法会被调用，以通知所有观察者
    void notifyObservers();

}
