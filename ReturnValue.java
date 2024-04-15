public class ReturnValue {

    public static void main(String[] args) {
           double area1 = calculateArea(2.3, 3.6);
           double area2= calculateArea(1.5, 6.3);
           double area3= calculateArea(8.7, 1.2);
        }
    
        public static double calculateArea(double length, double width){
            double area = length*width;
            return area;
        }
}
