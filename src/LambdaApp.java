import java.util.ArrayList;
import java.util.List;

class Cat{
    String name;
    int weight;

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
public class LambdaApp{

    public static void main(String[] args) {

        Cat cat1 = new Cat("Luska", 5);
        Cat cat2 = new Cat("Umka", 7);
        Cat cat3 = new Cat("Barsic", 2);
        Cat cat4 = new Cat("Kuzia", 3);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4));

        cats.removeIf(LambdaApp::testCat);

        System.out.println(cats);
    }


    private static boolean testCat(Cat cat) {
        return cat.getWeight() < 4;
    }
}
