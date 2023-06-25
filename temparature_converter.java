import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        
        System.out.println("Select conversion option:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        double convertedTemperature;
        
        switch (choice) {
            case 1:
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.println(temperature + " Celsius = " + convertedTemperature + " Fahrenheit");
                break;
            case 2:
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.println(temperature + " Fahrenheit = " + convertedTemperature + " Celsius");
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        sc.close();
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
