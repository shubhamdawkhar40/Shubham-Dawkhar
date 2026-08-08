package SolvedProblems;
import java.util.*;

public class Fibonaci {
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        int count = 5;
        for(int i = 0; i <= count; i++){
            int temp = b;
            b = a + b;
            System.out.print(a+" ");
            a = temp;
        }
        // Scanner sh = new Scanner(System.in);
        // sh.close();
        // System.out.println("Fibonacci Series :-");
        // System.out.print("Enter number :");
        // int n = 5;

        // int fb;
        // for(int i = 0; i <= n; i++){
        //     fb = a + b;
        //     a = fb;
        //     b = a + b;
        //     System.out.print(a+", ");
        //     System.out.print(b+",");
        //}
    }
}
