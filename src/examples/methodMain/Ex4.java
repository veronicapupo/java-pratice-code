package examples.methodMain;

public class Ex4 {

    public static void main(String[] args) {
        if (args.length == 3) {
            double[] numbers = new double[3];
            numbers[0] = Double.parseDouble(args[0]);
            numbers[1] = Double.parseDouble(args[1]);
            numbers[2] = Double.parseDouble(args[2]);

            System.out.println("First position: " + numbers[0]);
            System.out.println("First position: " + numbers[1]);
            System.out.println("First position: " + numbers[2]);
        }
    }
}
