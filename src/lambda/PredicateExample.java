package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    List<Integer> list;
    public PredicateExample(){
        list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    public static void main(String args[]){

        PredicateExample example = new PredicateExample();

        //모든 숫자 출력
        example.eval(n->true);

        //짝수 출력
        example.eval(n-> n%2 == 0 );

        //3보다 큰 수 출력
        example.eval(example.method());

    }
    public Predicate<Integer> method(){
        return n-> n > 3;
    }

    public void eval(Predicate<Integer> predicate) {
        for(Integer n: list) {

            //제약 검증
            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }

        //stream 사용
        list.stream().filter(n -> predicate.test(n)).forEach(n -> {
            System.out.println(n + " ");
        });
    }

}