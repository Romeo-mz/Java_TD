import java.util.Scanner;
http://v.vincent.u-bourgogne.fr/0ENS/I1a/
public class DecToBin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int number = scanner.nextInt();

        String binary = "";
        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }

        System.out.println("Le nombre binaire est : " + binary);
        scanner.close();
    }
}
