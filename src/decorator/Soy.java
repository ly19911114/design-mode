package decorator;

/**
 * @author LiuYang
 * @date 2020/4/13
 */

/**
 * 奶泡调料
 */
public class Soy extends CodimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage=beverage;
    }



    @Override

    public String getDescription() {
        return beverage.getDescription()+" ,Soy";
    }

    @Override
    public double cost() {
        return .15+beverage.cost();
    }
}
