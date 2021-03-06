package decorator.starbuzz;

/**
 * @author LiuYang
 * @date 2020/4/13
 */

/**
 * 具体饮料:浓咖啡Espresso
 * 首先，让Espresso扩展自Beverage类，因为Espresso是一种饮料
 */
public class Espresso extends Beverage{

    public Espresso(){
        //为了要设置饮料的描述，写了一个构造器。记住！！！，description实例变量继承自Beverage
        description="浓咖啡Espresso";
    }

    @Override
    public double cost() {
        //最后，需要计算Espresso的价钱，现在不需要管调料的价钱，直接把Espresso的价格￥1.99返回即可
        return 1.99;
    }
}
