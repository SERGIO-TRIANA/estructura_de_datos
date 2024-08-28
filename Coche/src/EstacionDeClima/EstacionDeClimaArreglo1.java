package EstacionDeClima;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstacionDeClimaArreglo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de temperaturas a almacenar: ");
        int maxSize = scanner.nextInt();
        EstacionDeClimaArreglo estacion = new EstacionDeClimaArreglo(maxSize);
        System.out.println("Ingrese las temperaturas (Escriba 'fin' para terminar): ");
        while (estacion.count < maxSize) {
            try {
                String input = scanner.next();
                if (input.equalsIgnoreCase("fin")){
                    break;
                }
                double temp = Double.parseDouble(input);
                estacion.addTemperature(temp);


            }
            catch (NumberFormatException | InputMismatchException e){
                System.out.println("Entrada invalida. por favor, ingrese un numero valido");
                scanner.nextLine();
            }
        }
        if (estacion.count > 0){
            estacion.showSummary();
        }else {
            System.out.println("No se ingresaron temperaturas.");
        }
    }
}
