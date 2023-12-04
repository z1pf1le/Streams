package Olexandr.sample4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main{
    public static void main(String[] args) {
        String[] arr = new String[] {"C", "Java", "Python"};

        IntStream stream = Arrays.stream(arr).flatMapToInt(n -> n.codePoints());

        stream.forEach(System.out::println);
    }
}
