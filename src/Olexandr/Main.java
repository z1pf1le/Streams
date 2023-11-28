package Olexandr;

import java.util.List;
import java.util.stream.Stream;

public class Main{

    public static void main(String[] args) {

        Cat cat1 = new Cat("Luska", 5);
        Cat cat2 = new Cat("Umka", 7);
        Cat cat3 = new Cat("Barsic", 2);
        Cat cat4 = new Cat("Kuzia", 3);

        List<Cat> list = List.of(cat1,cat2,cat3,cat4);

        Stream<Cat> catToName = list.stream()
                .filter(a -> a.getWeight() < 5)
                .peek(a -> a.setName("_"+a.getName()));

        catToName.forEach(a -> System.out.println(a));
        System.out.println();

        for (Cat cat : list){
            System.out.println(cat);
        }

    }
}
