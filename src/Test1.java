//https://www.youtube.com/watch?v=oTdm_CVIdJM

import java.util.*;
import java.util.stream.Collectors;

public class Test1{
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("one");
        list.add("three");
        list.add("five");
        list.add("eighteen");

//    for(int i = 0; i<list.size(); i++){                           по старому
//        list.set(i, String.valueOf(list.get(i).length()));
//    }

//        List<Integer> newList = list.stream().map(anus -> anus.length())
//                        .collect(Collectors.toList());
//
//        System.out.println(newList);

//        int[] array = {5, 3, 9, 8, 1};
//        int[] array2 = Arrays.stream(array).map(anus->{if (anus % 3 == 0){anus=anus/3;}return anus;}).toArray();
//        System.out.println(Arrays.toString(array2));

    }
}
