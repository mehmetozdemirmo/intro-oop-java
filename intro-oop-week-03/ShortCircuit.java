public class ShortCircuit {
    public static void main(String[] args) {
        int n, d, q;
        n= 10;
        d=2;
        if (d!= 0 && (n%d) == 0){
            System.out.println(d+ "is a factor of " + n);
        }
    }
}