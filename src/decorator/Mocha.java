package decorator;

/**
 * @author LiuYang
 * @date 2020/4/13
 */

/**
 * 摩卡是一个具体装饰者，所以让他扩展自CodimentDecorator
 * 别忘了！！CodimentDecorator扩展自Berverage
 */
public class Mocha extends CodimentDecorator {

    /**
     * 要想让Mocha能够引用一个Beverage，做法如下:
     * (1)用一个实例变量记录饮料，也就是被装饰者
     * (2)想办法让被装饰者(饮料)被记录到实例变量中。这里的做法是:把饮料当做构造器的参数，再由构造器将此饮料记录在实例变量中
     */
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }


    @Override
    public String getDescription() {
        /**
         * 希望叙述的不只是描述饮料(如:“Espresso”)，而是完整的连调料都能描述出来(例如 “Espresso,Mocha”)。
         * 所以首先利用委托的做法，得到一个叙述，然后在其后加上附加的叙述(例如“Mocha”)
         */
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        //饮料加上Mocha的价钱
        return .20+beverage.cost();
    }
}
