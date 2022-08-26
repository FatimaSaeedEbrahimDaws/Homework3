import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number;
        System.out.println("Input number less than ten billlion:");
        number = input.nextLong();
        if (number<(10*1000000000) ) {
            if (number < 0)
                number=number*(-1);
            if (number<10)
                System.out.println("Digital of the number "+number+" are: 1");
            else if (number>=10&&number<100)
                System.out.println("Digital of the number "+number+" are: 2");
            else if (number>=100&&number<1000)
                System.out.println("Digital of the number "+number+" are: 3");
            else if (number>=1000&&number<10000)
                System.out.println("Digital of the number "+number+" are: 4");
            else if (number>=10000&&number<100000)
                System.out.println("Digital of the number "+number+" are: 5");
            else if (number>=100000&&number<1000000)
                System.out.println("Digital of the number "+number+" are: 6");
            else if (number>=1000000&&number<10000000)
                System.out.println("Digital of the number "+number+" are: 7");
            else if (number>=10000000&&number<100000000)
                System.out.println("Digital of the number "+number+" are: 8");
            else if (number>=100000000&&number<1000000000)
                System.out.println("Digital of the number "+number+" are: 9");
           else if (number>=1000000000&&number<(10*1000000000))
                System.out.println("Digital of the number "+number+" are: 10");

        }
        else {
            System.out.println("Failure.");
        }
    }}