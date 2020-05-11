import java.io.*;
import java.util.*;

public class TimerMain {
    public static void main(String[] args){


        System.out.println(dayOfWeek(1, "Sun"));



    }public static String dayOfWeek(int dayInMonth, String dayOfFirst){
       ArrayList<String> days = new ArrayList<>();
       Iterator n = days.iterator();
       days.add("Mon");days.add("Tue");days.add("Wed");days.add("Thur");days.add("Fri");days.add("Sat");days.add("Sun");
        String [] day2 = new String[7];
        day2[0] = dayOfFirst;
        for(int i=0, j=days.indexOf(day2[0]); i<=6; i++, j++){
            if(days.get(j).equals("Sun")){
                day2[i] = days.get(j);
                j = -1;
            }else day2[i] = days.get(j);
        } String x = "";
        return "";
    }
}
