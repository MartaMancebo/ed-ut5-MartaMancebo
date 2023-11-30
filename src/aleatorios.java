import java.util.Scanner;

public class aleatorios {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int min, max, cant;
        System.out.print("Introduce el número mínimo: ");
        min = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce el número máximo: ");
        max = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce la cantidad de números que quieres obetener: ");
        cant = sc.nextInt();
        sc.nextLine();

        ale(min, max, cant); /*la llamada a la función tomará en cuenta los números que se han pedido,
        siendo así posible pedir cantidades diferentes cada vez que se use el programa*/

    }
    static void ale(int min, int max, int cant){
        System.out.println("Números aleatorios: ");
        for (int i = 0; i < cant; i++) { /*con este for establecemos que queremos que genere tantos números
         como la cantidad que se ha especificado */
            int random = min + (int) (Math.random() * max); /*el primer número que podrá salir será el mínimo
             que se ha pedido, y podrá llegar hasta el máximo */
            System.out.println(random);
        }
    }
}