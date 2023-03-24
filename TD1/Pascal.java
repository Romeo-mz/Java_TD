import java.util.Scanner;
public class Pascal {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre :");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            int coef = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(coef + " ");
                coef = coef * (i - j) / (j + 1);
            }
            System.out.println();
        }
        scanner.close();
    }
}