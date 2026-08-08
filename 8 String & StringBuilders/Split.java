import java.util.Arrays;

public class Split {
    public static void main(String args[]){
        String sr = "Shubham Shivram Dawkhar";
        System.out.println(Arrays.toString(sr.split(" ")));//this split not works on StringBuilders
    }
}
