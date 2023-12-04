package Olexandr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class M4 {
    public static void main(String[] args) {
//        String[] arr = {"Java", "Python", "C", "JavaScript", "Ruby", "Go"};

        List<String> list = List.of("Java", "Python", "C", "JavaScript", "Ruby", "Go");

//        int n = 5; // Длина, по которой будем фильтровать

//        Stream<String> filteredStream = Arrays.stream(arr)
//                .filter(str -> str.length() < n);
        Stream<Integer> filteredStream = list.stream().map(n->n.length());


        filteredStream.forEach(System.out::println); // Вывод отфильтрованных строк
    }
}
