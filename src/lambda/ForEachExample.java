package lambda;

import java.util.Arrays;
import java.util.List;


public class ForEachExample {

    public static void main(String[] args) {


        Integer[] arr = {1,4,3,6,3};

        List<Integer> list = Arrays.asList(arr);
        list.forEach((Integer value)-> System.out.println(value));
        list.forEach(System.out::println);
        Operation op = (a, b)->a+b;
    }
}
