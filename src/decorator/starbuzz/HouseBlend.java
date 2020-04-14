package decorator.starbuzz;

/**
 * @author LiuYang
 * @date 2020/4/13
 */

/**
 *综合咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description="综合咖啡House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
