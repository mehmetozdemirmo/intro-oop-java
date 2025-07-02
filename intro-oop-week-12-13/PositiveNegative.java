import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        try {
            System.out.println("bir sayı giriniz");
            int sayi = Input.nextInt();
            if (sayi < 0) {
                throw new IllegalArgumentException("Negative number is not allowed.");
            } else {
                sayi = sayi * sayi;
            }
            System.out.println("sayi:" + sayi);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input, please enter an integer.");

        }
    }
}
