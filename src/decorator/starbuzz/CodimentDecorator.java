package decorator.starbuzz;

/**
 * @author LiuYang
 * @date 2020/4/13
 */

/**
 * 调料，抽象装饰者类
 * 首先，必须让CodimentDecorator能够取代Beverage，所以将CodimentDecorator扩展自Beverage
 */
public abstract class CodimentDecorator extends Beverage{
    /**
     *所有的调料装饰者都必须重新实现getDescription()方法
     * @return
     */
    public abstract String getDescription();
}
