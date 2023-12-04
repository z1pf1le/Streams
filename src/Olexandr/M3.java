package Olexandr;

import java.util.Arrays;
import java.util.List;

public class M3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Использование метода filter для фильтрации значений
        numbers.stream()
                .filter(num -> num % 2 == 0) // Оставить только четные числа
                // Использование метода map для преобразования значений
                .map(num -> num * 2) // Удвоить каждое число
                // Использование метода reduce для агрегации значений
                .reduce((a, b) -> a + b) // Сложить все числа
                // Вывод результата
                .ifPresent(System.out::println); // Вывести сумму

    }

}