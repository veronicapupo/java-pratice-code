package basics.methodMain;

public class Ex1 {

        public static void main (String[] args){

            int sum=0;
            if(args.length <=0){
                System.out.println( "There is no values");
                return;
            }
            for(String n:args){
                int v=Integer.parseInt(n);
                sum+=v;
            }
            System.out.println("Total sum"+ sum);
        }
    }

