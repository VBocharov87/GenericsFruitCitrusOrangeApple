import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        Basket<Apple> appleBasket1 = new Basket<>();
        appleBasket1.add(new Apple());

        Basket<Apple> appleBasket2 = new Basket<>();
        appleBasket2.add(new Apple());

        Basket<Fruit> fruitBasket = new Basket<>();
        fruitBasket.add(new Apple());
        fruitBasket.add(new Orange());
        Basket<Fruit> fruitBasket1 = new Basket<>();
        fruitBasket1.add(new Orange());
        fruitBasket1.add(new Apple());
//        appleBasket1.transfer(appleBasket2);
        fruitBasket.transfer(fruitBasket1);

        List<Number> nums = new ArrayList<Number>();
        List<? super Integer> ints = nums;

        System.out.println("Test Git");
    }
}

class Test<Number> {

}
class Test_inheritor {

}