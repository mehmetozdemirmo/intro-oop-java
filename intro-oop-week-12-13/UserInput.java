import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        boolean a =true;
        do{
            Scanner Input = new Scanner(System.in);
            System.out.print("Bir sayı giriniz: ");
            try{
                int sayi = Input.nextInt();
                System.out.println("Girdiğiniz sayı: " + sayi);
                a=false;
            }catch (InputMismatchException e){
                System.out.println("you entered ınvalıd value please enter a valid value.");
            }
        }while(a);


    }
}
