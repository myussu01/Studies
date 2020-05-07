import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args){

        System.out.print(sumDigits("345"));
    }public static int sumDigits(String s){
        int x = 0;
        for(int i = 0; i<s.length(); i++){
            x+= Character.getNumericValue(s.charAt(i));
        }
        return x;
    }
}
