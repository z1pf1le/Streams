package Olexandr;

import java.util.Arrays;
import java.util.stream.Stream;

public class M4 {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "C", "JavaScript", "Ruby", "Go"};

        int n = 5; // Длина, по которой будем фильтровать

        Stream<String> filteredStream = Arrays.stream(arr)
                .filter(str -> str.length() < n);


        filteredStream.forEach(System.out::println); // Вывод отфильтрованных строк
    }
}
