package basics.arrays;

public class Ex3 {

    public static void main(String[] args) {


        int[] v = {9, 3, 4, 1, 2};
        int aux = 0;

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {

                if (v[i] < v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }

            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.printf("[%d]", v[i]);

        }
    }
}
