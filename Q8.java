import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
      float salary, hours;double paycheck=0.0;

        String name;
        System.out.println("Input your name: ");
        name=in.nextLine();
        System.out.println("Input  your salary:" );
        salary=in.nextFloat();
        System.out.println("Input number hours: ");
        hours=in.nextFloat();
        if (hours<=40)
        paycheck=hours*salary;
        else if (hours>40)
        paycheck=40*salary+(hours-40)*salary*1.5;
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Hours: "+hours);
        System.out.println("Paychck: "+paycheck);

    }

}
