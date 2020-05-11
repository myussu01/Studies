import java.util.ArrayList;

public class Duplicate {
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<>();
        x.add(4);
        x.add(6);
        x.add(8);
        x.add(19);
        x.add(20);
        x.add(21);
        x.add(22);
        dup(x);
        for(Integer g: x){
            System.out.printf(g + "\n");
        }


    }public static <T> void dup(ArrayList<T> list){
       int c = list.size()*2;
       for(int i = 0; i<c; i+=2){
       list.add(list.indexOf(list.get(i))+1,list.get(i));
       }


    }
}
