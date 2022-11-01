package basics.methodMain;

public class Ex5 {
    //[1] [2.0] [true] [Veronica]
    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);
        double d = Double.parseDouble(args[1]);
        boolean b = Boolean.parseBoolean(args[2]);
        String s = args[3];

        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(s);
    }
}
