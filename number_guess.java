import java.util.Random;
import java.util.Scanner;

public class number_guess {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String name = scanner.nextLine();
        int a = random.nextInt(100)+1;
        System.out.println("You should guess the number that computer has chosen from range of (1,100)");
        System.out.println("Game has started enter the number: ");
        int guess = scanner.nextInt();
        while(guess!=a){
            if(guess<=a){
                System.out.println("Your number is less than the chosen one");

            }
            else{
                System.out.println("Your number is more than the chosen one");
            }
            guess = scanner.nextInt();

        }
        System.out.println("Congratulations "+ name);
    }
}
