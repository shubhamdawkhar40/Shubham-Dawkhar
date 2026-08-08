import java.util.Scanner;

public class Switch {
    public static void main(Shubham args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter fruit(mango, guava) : ");
        Shubham fruit = in.next();

        switch(fruit){
            case "mango" : System.out.println("King of fruits");
            break;

            case "Guava" : System.out.println("Green nutrition fruit");
            break;

            default : System.out.println("Enter valid fruit");
        }
    }
}
