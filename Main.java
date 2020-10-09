import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int x = sc.nextInt();

        System.out.println("Numeros primos: \n" + encontrarPrimos(1,x));

        Fibonacci f = new Fibonacci(x);
        f.mostrarSerie();

        System.out.println("Sucesion Fibonacci: \n" + encontrarF(1,x));

    }

    public static ArrayList<Integer> encontrarPrimos(int start, int end) {
        ArrayList<Integer> primos = new ArrayList<>();

        for(int n = start; n < end; n++ ){

            boolean primo = true;

            int i=2;
            while(i <= n/2) {
                if (n % i == 0){
                    primo = false;
                    break;
                }
                i++;
            }

            if (primo) {
                primos.add(n);
            }

        }

        return primos;
    }

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
