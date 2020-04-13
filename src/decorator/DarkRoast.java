package decorator;

/**
 * @author LiuYang
 * @date 2020/4/13
 */

/**
 * 深焙咖啡
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description="深焙咖啡Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
