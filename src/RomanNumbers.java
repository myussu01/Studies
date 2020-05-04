import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers would you like to enter");
        String k = "";
        String j = "";
        while(in.hasNextLine()){

            j = in.next();
            if(j.isEmpty())break;
            System.out.println(j);
        }
        System.out.println("Finished looping ");
       /* String f = convert(4);
        System.out.println(f);*/
    }
    private static String convert (int x){
        String s= "";
        while(x>=1000){
            s+="M";
            x-=1000;
        }while(x>=500){
            s+="D";
            x-=500;
        }while(x>=100){
            s+="C";
            x-=100;
        }while(x>=50){
            s+="L";
            x-=50;
        }while(x>=10){
            s+="X";
            x-=10;
        }while(x>=5){
            s+="V";
            x -=5;
        }while(x!=0){
            s+="I";
            x-=1;
        }
        return s;
    }
}
