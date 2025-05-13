package codekata;

public class EvenOrOdd {
    public static String evenOrOdd(int number) {
        if (number % 2 == 0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    public static void main(String[] args){
        System.out.println(evenOrOdd(9));
        System.out.println(evenOrOdd(5));
        System.out.println(evenOrOdd(7));
        System.out.println(evenOrOdd(20));
    }

}