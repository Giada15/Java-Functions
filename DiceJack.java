import java.util.Scanner;

/**
 * DiceJack
 */
public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pick three numbers between 1 and 6");
        int userNumber1 = scan.nextInt();
        int userNumber2 = scan.nextInt();
        int userNumber3 = scan.nextInt();

        int roll1= rollDice();
        int roll2= rollDice();
        int roll3= rollDice();

        int userSum = userNumber1+userNumber2+userNumber3;
        int rollSum = roll1+roll2+roll3;

        System.out.println("User numbers: " + userNumber1 + " " + userNumber2 + " "+ userNumber3 + " " );
        System.out.println("Rolled numbers: " + roll1 + " " + roll2 + " "+ roll3 + " " );   
        
    }

    public static int rollDice(){
        double randomNumber = (Math.random() * 6) + 1;
        return (int)randomNumber;

    }

   
}
