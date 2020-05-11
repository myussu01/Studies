import java.util.*;

public class Test {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<>();
        a.add("Mohamed");
        a.add("Hussein");
        a.add("Khalid");
        a.add("Hussein");
        a.add("Hussein");
        a.add("Hussein");


        move(a,"Hussein");
        for(String i: a){
            System.out.printf(i + "\n");
        }

    } public static <E> void move(ArrayList<E> list, E value )
    {
        int g = 0;
        ArrayList<E> x = new ArrayList<>();
        while(list.contains(value)){
            x.add(value);
            list.remove(value);
            g+=1;

        }
        while(g!=0){list.add(0,x.get(0)); g-=1;}
        x.remove(0);
    }
}
