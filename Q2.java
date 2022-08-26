import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String letter,color=null; int number;
        Scanner in=new Scanner(System.in);

        System.out.println("Input letter a,b,c,e,f,g,h :");
       letter=in.next() ;
        System.out.println("Input number 1,2,3,4,5,6,7,8 :");
        number=in.nextInt();
        if (letter.equals("a")||letter.equals("c")||letter.equals("e")||letter.equals("g")) {
            if (number == 1 || number == 3 || number == 5 || number == 7)
            { color = "Black";
            System.out.println("Color square on  a chess "+letter+number+" "+color);}
            else if (number == 2 || number == 4 || number == 6 || number == 8)
            { color = "White";
            System.out.println("Color square on  a chess "+letter+number+" "+color);}
            else
                System.out.println("Error input number.");
              }
        else  if (letter.equals("b")||letter.equals("d")||letter.equals("f")||letter.equals("h")) {
            if (number == 2 || number == 4 || number == 6 || number == 8)
            {color = "Black";
            System.out.println("Color square on  a chess "+letter+number+" "+color);}
            else if (number == 1 || number == 3 || number == 5 || number == 7)
            {   color = "White";
            System.out.println("Color square on  a chess "+letter+number+" "+color);}
            else
                System.out.println("Error input number.");
             }
        else
            System.out.println("Error input letter.");


        }

    }

