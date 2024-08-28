package EstacionDeClima;

import java.util.ArrayList;
import java.util.List;

public class EstacionDeClima1 {
    public List<Double> temperatures;

    public EstacionDeClima1() {
        temperatures = new ArrayList<>();
    }

    public void addTemperature(double temp) {
        temperatures.add(temp);
    }

    public double getMaxTemperature() {
        return temperatures.stream().max(Double::compare).orElse(Double.NaN);
    }

    public double getMinTemperature() {
        return temperatures.stream().min(Double::compare).orElse(Double.NaN);
    }

    public double getAverageTemperature() {
        return temperatures.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
    }

    public List<Double> getAboveAverageTemperatures(double average) {
        List<Double> aboveAverage = new ArrayList<>();
        for (double temp : temperatures) {
            if (temp > average) {
                aboveAverage.add(temp);
            }
        }
        return aboveAverage;
    }
    public void showSummary(){
        double maxTemp = getMaxTemperature();
        double minTemp = getMinTemperature();
        double avgTemp = getAverageTemperature();

        System.out.println("Temperatura maxima: " + maxTemp + " Grados centigrados.");
        System.out.println("Temperatura minima: " + minTemp + " Grados centigrados.");
        System.out.println("Temperatura promedio: " + avgTemp + " Grados centigrados.");

        List<Double> aboveAverageTemps = getAboveAverageTemperatures(avgTemp);
        System.out.println("Temperaturas por encima del promedio:");
        for (double temp : aboveAverageTemps){
            System.out.println(temp + " Grados centigrados.");
        }
    }
}
