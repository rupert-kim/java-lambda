package FunctionalInterface;

@FunctionalInterface
interface Calculator{
    int exec(int a, int b);
}

public class CalculateUsable {
    public static void main(String[] args) {
        Calculator calcNormal = new Calculator() {
            @Override
            public int exec(int a, int b) {
                return a+b;
            }
        };

        Calculator calcLambda = (a,b)->{
            return a-b;
        };
        Calculator calcShortLambda = (a,b) -> a*b;

        calcNormal.exec(9,3);//12
        calcLambda.exec(9,3);//6
        calcShortLambda.exec(9,3);//27

    }
}
