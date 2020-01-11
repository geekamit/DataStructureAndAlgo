//package chapter2.p41;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.IntBinaryOperator;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        Stream<String> bands = Files.lines(Paths.get("C:\\Users\\akumar2059\\cloudcode-projects\\JavaCodingProblems\\src\\band.txt"));
//        List<String> bands2 = bands
//                .filter(x-> x.contains("jit"))
//                .collect(Collectors.toList());
//
//        bands2.forEach(System.out::println);
//        bands.close();
//
//        myLambda greetingFunction = () -> System.out.println("Hello");
//
////        FunctionalInterface addFunction = (int a, int b) -> a + b;
////
////        FunctionalInterface swapNumber = (int a, int b) -> {
////            b = a + b;
////            a = b - a;
////            b = a - b;
////        };
//
//
//
//    }
//
//    interface myLambda{
//        void foo();
//    }
//}
