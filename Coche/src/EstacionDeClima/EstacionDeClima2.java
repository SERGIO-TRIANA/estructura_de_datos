package EstacionDeClima;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstacionDeClima2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstacionDeClima1 estacion = new EstacionDeClima1();

        System.out.println("Ingrese las temperaturas (escriba 'fin' para terminar " );
        while (true){
            try {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("fin")){
                    break;
                }
                double temp = Double.parseDouble(input);
                estacion.addTemperature(temp);

            } catch (NumberFormatException | InputMismatchException e){
                System.out.println("Entrada invalidad. Por favor, ingrese un numero valido.");
                scanner.nextLine();
            }
        }
        if (!estacion.temperatures.isEmpty()){
            estacion.showSummary();
        }else {
            System.out.println("No se ingresaron temperaturas.");
        }
    }
}
