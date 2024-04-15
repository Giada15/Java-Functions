public class Parameters {

    public static void main(String[] args) {
    //    calculateArea(2.3, 3.6);
    //    calculateArea(1.5, 6.3);
    //    calculateArea(8.7, 1.2);

    tipCalculator(53.5);
    }

    public static void calculateArea(double length, double width){
        double area = length*width;
        System.out.println("Area: " + area);
    }

    public static void tipCalculator(double bill){
        double tip = bill*0.15;
        System.out.println("Your service was wonderful! Please, accept this tip: $"+  tip);

    }
    
}
