package decorator;

/**
 * @author LiuYang
 * @date 2020/4/13
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        //订一杯Espresso,不需要调料，打印出他的价格
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        //制造出一个DarkRoast的对象
        Beverage beverage2=new DarkRoast();
        //用Macha装饰它
        beverage2=new Mocha(beverage2);
        //用第二个Macha装饰它
        beverage2=new Mocha(beverage2);
        //用Whip去装饰它
        beverage2=new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());

        //最后再来一杯调料为豆浆、摩卡、奶泡的HouseBlend咖啡
        Beverage beverage3=new HouseBlend();
        beverage3=new Soy(beverage3);
        beverage3=new Mocha(beverage3);
        beverage3=new Whip(beverage3);
        System.out.println(beverage3.getDescription()+" $"+beverage3.cost());


    }

}
