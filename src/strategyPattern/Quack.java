package strategyPattern;

public class Quack implements QuackBehavior {
    @Override
    public void quck() {
        System.out.println("我会呱呱叫");
    }
}
