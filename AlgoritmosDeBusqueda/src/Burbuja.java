import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        boolean continuar = false;

        do {

            System.out.println("Ingrese un numero para agregar a la lista.");
            int numero = scanner.nextInt();
            lista.agregar(numero);
            scanner.nextLine();
            System.out.println("Quiere agregar mas numeros? si/no");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("si")){
                continuar = true;
            } else {
                continuar = false;
            }
        } while (continuar);
        System.out.println("Lista Ooriginal");
        lista.imprimir();
        lista.ordenar();
        System.out.println("lista ordenada");
        lista.imprimir();


    }
}
