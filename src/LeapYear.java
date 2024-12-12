import java.util.Scanner;

public class LeapYear {

    public static void LeapYear(){
        System.out.println("Enter the year");
        Scanner sc= new Scanner(System.in);
        int year = sc.nextInt();
        if(year<1000 || year>9999){
            System.out.println("Please Enter a valid year");
            return;
        }
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("Its a Leap year");
        }
        else
            System.out.println("Its not a leap year");


    }
}
