import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner  input =new Scanner(System.in);
        int number;
        System.out.println("Input of the number:");
        number=input.nextInt();
        if(number<0)
            System.out.println("Negative.");
        else if (number>0)
            System.out.println("Positive.");
        else if (number==0)
            System.out.println("Zero.");

    }
}
