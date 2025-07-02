import java.util.Scanner;

public class MainYoung {

    public static void checkAge(int age) throws TooYoungException{

        if(age<18){
            throw new TooYoungException("you are too young.");
        }
        System.out.println("Access granted.");


    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        try{
            System.out.println("please enter your age");
            int yourAge=input.nextInt();
            checkAge(yourAge);
        } catch (TooYoungException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("ınvalid input");
        }

    }
}
