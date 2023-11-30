import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce el término que quieres saber: ");
        n = sc.nextInt();
        fibo(n); //llamada a la función
        long resultado = fibo(n); //el resultado será la "solución" que nos da la función que acabamos de llamar
        System.out.println("El término " + n + " de la serie de Fibonacci es " + resultado);
    }
    static long fibo(int n) {
        if (n <= 1) {
            return 1; //Si el número n es 0 o 1 se devolverá 1
        } else {
            return fibo(n - 1) + fibo(n - 2); // si es cualquier otro número, se hará la suma

        }
    }
}