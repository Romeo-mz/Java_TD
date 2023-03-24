import java.util.Scanner;


public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        scanner.close();

        if (isPrime) {
            System.out.println(number + " est un nombre premier.");
        } else {
            System.out.println(number + " n'est pas un nombre premier.");
        }
    }
}
