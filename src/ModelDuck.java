/**
 * 模型鸭
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior=new FlyNoWay();
//        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是模型鸭子");
    }
}
