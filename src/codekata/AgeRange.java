package codekata;

public class AgeRange{
    public static String datingRange(int age) {
        //return min-max
        int min, max;
        if(age<= 14){
            min = (int)Math.floor(age - 0.10 * age);
            max = (int)Math.floor(age + 0.10 * age);
        }
        else {
            min = (int)Math.floor(age / 2.0 + 7);
            max = (int)Math.floor((age - 7) * 2);
        }
        return min + "-" + max;
    }
    public static void main (String[] args){
        System.out.println(datingRange(27));
        System.out.println(datingRange(5));
        System.out.println(datingRange(17));
    }
}