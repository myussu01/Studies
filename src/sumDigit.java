import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args){
        ArrayList<String> k = new ArrayList<>();
        k.add("Mohamed");
        k.add("Hussein");
        k.add("Jama");
        k.add("Abdallah");
        Iterator it = k.iterator();

        for(int i = 0; i<=k.size()+10; i++ ){
            while(it.hasNext()){
                System.out.printf("%s \n",it.next());
            }it = k.iterator();                System.out.printf("%s \n",it.next());


/*
            if(!it.hasNext()){
                it = k.iterator();
            }else{
                System.out.println(k.get(i));
            }*/
        }



       /* System.out.println(sumDigits("345"));
        TimePeriod x = new TimePeriod(3,120);
        System.out.printf(x.toString());*/


    }public static int sumDigits(String s){
        int x = 0;
        for(int i = 0; i<s.length(); i++){
            x+= Character.getNumericValue(s.charAt(i));
        }
        return x;
    }
}
