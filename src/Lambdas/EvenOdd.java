package Lambdas;

@FunctionalInterface
interface NumberCheck {
    boolean check(int n);
}

public class EvenOdd {
    public static void main(String[] args) {


        NumberCheck isEven = n -> n % 2 == 0;

        NumberCheck isOdd = n -> n % 2 != 0;

        System.out.println(isEven.check(10) ? "Even" : "Odd");
        System.out.println(isOdd.check(7) ? "Odd" : "Even");
    }
}
