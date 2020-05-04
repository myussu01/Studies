import java.util.Scanner;


public class NonLeapYear {

    public static void main(String [] args){
        String [] months = {"January", "February", "March", "April", "May", "June", "July"
        , "August", "September", "October", "November", "December"};
        int [] am = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number");
        int h = x.nextInt();

        System.out.println(cal(h,am,months));

    }

    static String cal (int c, int[] b, String[] z){
        int j = -1;
        for(int i = 0, x = 0; x<c; i++){
            x += b[i];
            j+=1;
        }

        return z[j] ;
    }
    /*  int m(int n){
        int x =0;

        return x;
        }

     }*/
}
