package examples.methodMain;

public class Ex3 {

    //command : java ./Test.java  veronica 30
    public static void main(String[] args) {

        String name = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println(name);
        System.out.println(age);
    }

}
