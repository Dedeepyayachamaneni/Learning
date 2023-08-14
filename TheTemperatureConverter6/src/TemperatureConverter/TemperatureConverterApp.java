package TemperatureConverter();
import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in degree-F");
		double f=scan.nextDouble();
		TemperatureConverterApp a = new TemperatureConverterApp();
		double temp = a.convertFahrenheitToCelsius(f);
		System.out.println("temp");
	}

}


