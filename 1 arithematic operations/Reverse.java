package SolvedProblems;

public class Reverse {
    public static void main(String args[]){
        int n = 12345;
        int b = 0;
        while(n > 0){
            int a = n % 10;
            b = b * 10 + a;
            n = n / 10;
        }
        System.out.print(b);
    }
}
