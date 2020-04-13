package decorator;

/**
 * @author LiuYang
 * @date 2020/4/13
 */

/**
 * 星巴克饮料的超类，是一个抽象类
 */
public abstract class Beverage {
    String description ="Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
