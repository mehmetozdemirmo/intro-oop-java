import java.io.IOException;

public class DecrWhile {
    public static void main(String[] args) throws IOException {
        int x;
        x=100;
        while(x>-100){
            System.out.println("x = " + x);
            x-=5;
        }

    }
}
