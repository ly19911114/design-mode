package decorator.starbuzz;

/**
 * @author LiuYang
 * @date 2020/4/13
 */

/**
 * 豆浆调料
 */
public class Whip extends CodimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,Whip";
    }

    @Override
    public double cost() {
        return .10+beverage.cost();
    }
}
