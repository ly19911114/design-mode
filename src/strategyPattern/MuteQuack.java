package strategyPattern;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quck() {
        System.out.println("我会吱吱叫");
    }
}
