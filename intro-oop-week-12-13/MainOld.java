import java.util.Scanner;

public class MainOld {
    public static void MainOld(int age) throws TooOldException{
        if(age>60){
            throw new TooOldException("you are too old.");
        }
        System.out.println("you are accessed");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        try{
            System.out.println("please enter your age");
            int yourAge=input.nextInt();
            MainOld(yourAge);
        }catch (TooOldException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("ınvalid input.");
        }
    }
}
