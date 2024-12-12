import java.util.Scanner;

public class FlipCoin {

    public static void FlipCoin(){
        Scanner sc= new Scanner(System.in);
        int heads=0,tails=0;
        System.out.println("Enter the number of times the coins need to be flipped");
        int flips= sc.nextInt();
        for (int i = 0; i < flips; i++) {
            double rand= Math.random();
            if(rand<0.5) tails++;
            else heads++;

        }

        double headP= (double) heads/flips *100;
        double tailP= (double) tails/flips *100;

        System.out.println("Head Percentage = "+headP);
        System.out.println("Tail Percentage = "+tailP);

    }
}
