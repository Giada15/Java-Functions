public class Weather {
    public static void main(String[] args) {
        
        double noon = 77;
        double evening = 61;
        double midnight = 55;

        
        double noonCelsius =fahrenheitToCelsius(noon);
        double eveningCelsius = fahrenheitToCelsius(evening);
        double midnightCelsius = fahrenheitToCelsius(midnight);


        printTemperatures(noon);
        System.out.println("C: " + noonCelsius);
        printTemperatures(evening);
        System.out.println("C: "+ eveningCelsius);;
        printTemperatures(midnight);
        System.out.println("C: "+ midnightCelsius);;
        

    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit-32)*5/9;
        return celsius;
    }

    public static void printTemperatures(double fahrenheit){
        System.out.println("F: " + fahrenheit);
    }
    
}
