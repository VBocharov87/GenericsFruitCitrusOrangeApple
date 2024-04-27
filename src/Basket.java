import java.util.ArrayList;

public class Basket<F extends Fruit> {
    ArrayList<F> contains = new ArrayList<>();

    void add(F fruit) {
        contains.add(fruit);
    }

    double getWeight() {
        double weight = 0;
        for (F contain : contains) {
            weight += contain.weight;
        }
        return weight;
    }

    double compare(Basket<?> another) {
        return Double.compare(getWeight(), another.getWeight());
    }

    void transfer(Basket<? super F> another) {
        System.out.println("Current basket contains: " + contains);
        System.out.println("Outer basket contains: " + another.contains);
        System.out.println("Now transferrring..");
        another.contains.addAll(this.contains);
        contains.clear();
        System.out.println("Current basket contains: " + contains);
        System.out.println("Outer basket contains: " + another.contains);
    }
}
