package Olexandr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class M2{
    public static void main(String[] args) {
        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120)
                .filter(x -> x < 90).map(x -> x + 10)
                .limit(3).
                forEach(System.out::print);
    }




}
