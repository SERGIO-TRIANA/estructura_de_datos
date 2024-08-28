package EstacionDeClima;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EstacionDeClimaArreglo {

    public double[] temperatures;
    public int count;

    public EstacionDeClimaArreglo(int maxSize){
        temperatures = new double[maxSize];
        count = 0;
    }
    public void addTemperature(double temp){
        if (count < temperatures.length){
            temperatures[count] = temp;
            count++;
        }else {
            System.out.println("No se pueden agregar mas temperaturas, el arreglo esta lleno.");
        }
    }
    public double getMAxTemperature(){
        return Arrays.stream(temperatures, 0, count).max().orElse(Double.NaN);
    }
    public double getMinTemperature(){
        return Arrays.stream(temperatures, 0, count).min().orElse(Double.NaN);
    }
    public double getAverageTemperature(){
        return Arrays.stream(temperatures, 0, count).average().orElse(Double.NaN);
    }
    public double[] getAboveAverageTemperatures(double average){
        return Arrays.stream(temperatures, 0, count).filter(temp -> temp > average).toArray();
    }
    public void showSummary(){
        double maxTemp = getMAxTemperature();
        double minTemp = getMinTemperature();
        double averageTemp = getAverageTemperature();

        System.out.println("Temperatura maxima " + maxTemp + " Grados centigrados.");
        System.out.println("Temperatura minima " + minTemp + " grados centigrados.");
        System.out.println("Temperatura promedio " + averageTemp + " grados centigrados");

        double[] aboveAverageTemps = getAboveAverageTemperatures(averageTemp);
        System.out.println("temperaturas por elcima del promedio: ");
        for (double temp : aboveAverageTemps){
            System.out.println(temp + " grados centigrados");
        }
    }
}


























