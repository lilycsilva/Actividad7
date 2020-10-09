import java.util.ArrayList;

public class Fibonacc {

    public static ArrayList<Integer> encontrarF(int start, int end) {
        ArrayList<Integer> fibonac = new ArrayList<>();

        int num1 = 0;
        int num2 = 1;
        int suma = 1;

        System.out.println(num1);

        for (int i = start; i < end; i++) {

            // muestro la suma
            System.out.println(suma);

            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
        }

        return fibonac;

    }
}