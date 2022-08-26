import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int month,day;
        String season=null;
        System.out.println("Input month 1-12 : ");
        month=in.nextInt();
        System.out.println("Input day 1-31 : ");
        day=in.nextInt();
        if (month>=1&&month<=12&&day>=1&&day<=31){
        if (month==1||month==2||month==3)
         season="Winter season.";
      else   if (month==4||month==5||month==6)
            season="Sprit season.";
     else   if (month==7||month==8||month==9)
            season="Summer season.";
      else   if (month==10||month==11||month==12)
            season="Fall season.";
      if (month%3==0&&day>=21)
      {
          if (season.equals("Winter season."))
          season="Sprit season.";
       else    if (season.equals("Sprit season."))
              season="Summer season.";
         else  if (season.equals("Summer season."))
          season="Fall season.";
         else
          season="Winter season.";

    }
        System.out.println(season);
    }
        else System.out.println("Error input.");
    }






}
