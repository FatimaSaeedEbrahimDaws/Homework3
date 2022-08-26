import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner intput=new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("Input number 1:");
        number1=intput.nextInt();
        System.out.println("Input number 2:");
        number2=intput.nextInt();
        System.out.println("Input number 3:");
        number3=intput.nextInt();
        if (number1==number2&&number1==number3&&number2==number3)
            System.out.println("All the same.");
       else if (number1!=number2&&number1!=number3&&number2!=number3)
            System.out.println("All different.");
       else
            System.out.println("Neither.");


    }
}
