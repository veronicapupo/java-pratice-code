package examples.methodMain;

public class Ex2 {
    public static void main(String[] args) {

        if (args.length > 0) {
            int sum = 0;
            for (String value : args) {
                sum += Integer.parseInt(value);
            }
            System.out.println(sum);
            return;
        }
        System.out.println("args is empty");
    }
}
