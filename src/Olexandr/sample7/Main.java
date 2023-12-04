package Olexandr.sample7;

import java.util.function.Supplier;

public class Main{
    public static void main(String[] args) {

    }

    public static Supplier<Integer> getRandomNumber(int start, int end){
        class RandGen implements Supplier<Integer>{
            @Override
            public Integer get() {
                return (int) (start + Math.random() * (end - ))
            }
        }
    }
}
