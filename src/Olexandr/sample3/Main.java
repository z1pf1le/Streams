package Olexandr.sample3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
       Singer singer1 = new Singer("Hoi", new String[]{"Lirika", "SElsky keif"});
       Singer singer2 = new Singer("Tsoi", new String[]{"Kukushka", "Peremen", "Prohojy"});
       Singer singer3 = new Singer("KiSH", new String[]{"Ohotnik", "Motorcycle>"});

       Singer[] rockStars = new Singer[]{singer1,singer2,singer3};

        List<String> song = Arrays.stream(rockStars)
                .flatMap(n-> Arrays.stream(n.getSongs()))
                .collect(Collectors.toList());

        System.out.println(song);
    }
}

