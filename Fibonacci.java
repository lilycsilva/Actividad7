public class Fibonacci {

    public int size;

    public Fibonacci(int size){
        this.size = size;
    }

    public void mostrarSerie(){
        System.out.println("Sucesion de Fibonacci hasta "+this.size+":");
        for (int i = 0; i < size; i++) {
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();
    }

    int fibonacci(int n) {
        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

}

