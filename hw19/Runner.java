package edu.dmacc.codedsm.hw19;

import java.util.function.*;

public class Runner {

    public static void main(String[] args) {
        Function<String,Integer> stringToInt = (s) -> s.length();
        System.out.println(stringToInt.apply("Des Moines"));

        BiFunction<String,String,Integer>  stringsToInt = (r,s) -> r.length() + s.length();
        System.out.println(stringsToInt.apply("Urbandale", "west"));

        Consumer<String> useString = (s) -> System.out.println(s);
        useString.accept("Iowa");

        Supplier<String> makeString = () -> "Hello!";
        System.out.println(makeString.get());
    }

}
 