import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("enter a first number:");

        System.out.println("enter a second number:");

        try{
            int sayi = Input.nextInt();
            int sayi2 = Input.nextInt();
            int newsayi=sayi/sayi2;
            System.out.println("newsayi = " + newsayi);
        }catch (InputMismatchException e){
            System.out.println(e.toString());

        }catch (ArithmeticException e){
            System.out.println(e.toString());

        }catch(Exception e){
            System.out.println(e.toString());
        }
        System.out.println("işlem bitti");
    }
}
