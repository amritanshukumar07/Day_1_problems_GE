public class PowerOfTwo {
    public static void main(String [] args){
        if(args.length==0){
            System.out.println("Please Enter a valid command line argument");
            return;
        }

        int N= Integer.parseInt(args[0]);


        if( N<0 || N>=31){
            System.out.println("Please provide a value of integer between 0 and 31");

        }


        for( int i=0;i<N;i++){
            System.out.println("2^"+i+" = "+ (int) Math.pow(2,i));
        }
    }
}
