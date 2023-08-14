
import java.util.Scanner;

	public class TemperatureConverterApp {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the temperature in degree-F");
			double f=scan.nextDouble();
			TemperatureConverterApp temperatureConverter = new TemperatureConverterApp();
			double tempincelcius =temperatureConverter.convertFahrenheitToCelsius(double fahrenheit);
			System.out.println(tempincelcius);
		

		}

}







