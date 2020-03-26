package strategyPattern;

/**
 * 野鸭子
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        //使用Quack类来处理呱呱叫，所以当Duck超类中的performQuack()被调用时，叫的职责委托给了Quack对象，而我们得到了真正的呱呱叫
        //对父类的接口field进行初始化，明确他属于什么行为
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是MallDuck鸭子");
    }
}
