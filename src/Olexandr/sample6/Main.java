package Olexandr.sample6;

import java.util.List;
import java.util.stream.Stream;

public class Main{

    public static void main(String[] args) {


        Stream<String> stream1 = Stream.empty();


        stream1.forEach(n->System.out.println(n));
    }
}