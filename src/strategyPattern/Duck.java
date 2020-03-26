package strategyPattern;

/**
 * 超类
 */
public abstract class Duck {
    //定义接口类型的引用变量,每只鸭子都会引用实现FlyBehavior和QuackBehavior接口的UI小
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    //鸭子的外观，要定义成抽象的方法，便于子类根据自身不同的外观进行重写
    public abstract void display();

    //取代fly()和quck()
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuck(){
        //鸭子对象不亲自处理呱呱叫的行为，而是委托给quackBehavior引用的对象
        quackBehavior.quck();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }

    public void swim(){
        System.out.println("所有的鸭子都会游泳");
    }



}
