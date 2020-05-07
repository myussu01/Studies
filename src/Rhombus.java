import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args ){
        int x,j,i;
        for(i=1;i<=4;i++)                        // To print part 1 of shape
        {
            for(x=4-i;x>0;x--)                  // To print white spaces
                System.out.print(' ');
            for(j=2*i-1;j>0;j--)                // To print '*'
                System.out.print('*');
            System.out.print('\n');
        }
        /*for(i=3;i>=0;i--)                    // To print part 2 of shape
        {
            for(x=0;x<4-i;x++)   // To print white spaces
                System.out.print(' ');
            for(j=0;j<2*i-1;j++)                // To print '*'
                System.out.print('*');
            System.out.println();
        }*/
    }
}
