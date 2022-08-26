import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long number = 0;
        System.out.println("1-January.        2-February.       3-March.        4-April.");
        System.out.println("5-May.            6-June.           7-July.         8-August. ");
        System.out.println("9-Sebtember.      10-October.       11-November.    12-December.");
        System.out.println("Input the month number: ");
        number= in.nextLong();
        if (number>=1&&number<=12)
        {
        if (number==1)
            System.out.println("Number of days of January 31 day.");
         else    if (number==2)
                System.out.println("Number of  days February of  28 day.");
        else    if (number==3)
            System.out.println("Number of days March of 31 day.");
        else    if (number==4)
            System.out.println("Number of days of April 30 day.");
        else    if (number==5)
            System.out.println("Number of days of May 30 day.");
        else    if (number==6)
            System.out.println("Number of days of June 30 day.");
        else    if (number==7)
            System.out.println("Number of days of July 31 day.");
        else    if (number==8)
            System.out.println("Number of days of August 31 day.");
        else    if (number==9)
            System.out.println("Number of days of Sebtember 30 day.");
        else    if (number==10)
            System.out.println("Number of days of October 31 day.");
        else    if (number==11)
            System.out.println("Number of days of November 30 day.");
        else    if (number==12)
            System.out.println("Number of days of December 31 day.");
    }
        else
            System.out.println("There is no month of this number.");
}}
