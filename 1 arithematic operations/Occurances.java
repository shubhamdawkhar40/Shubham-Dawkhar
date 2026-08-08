package SolvedProblems;
import java.util.*;

public class Occurances{
    public static void main(String args[]){
        // int count = 0;
        // int arr[] = {1,3,8,5,6,4,5,6,7,8,7,6,5,4,3}; 
        // int n = 5;
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == n){
        //         count++;
        //     }
        // }
        // System.out.println(n+" occured "+count+" times.");
        int count = 0;
        System.out.print("Enter no :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Which no you want to find :");
        int rem = sc.nextInt();

        while(n > 0){
            if(n % 10 == rem){
                count++;
            }
            n = n / 10;
        }
        System.out.print("The number "+rem+" occured "+count+" times.");
    }
}