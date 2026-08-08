package SolvedProblems;
import java.util.*;

public class NumberN {
    public static void main(String args[]){

        Scanner sh = new Scanner(System.in);
        System.out.print("Enter integer : ");
        int n = sh.nextInt();
        int i;

        for(i = 1; i <= n; i++){
            i = i + 1;
            System.out.print(i+" ");
        }
    }
}
