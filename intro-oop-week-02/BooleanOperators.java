public class BooleanOperators {
    public static void main(String[] args) {
        int i =0;
        if ( (i!=0) && (++i<10) ){
            System.out.println("This statement will not be executed.");
        }
        System.out.println("Value of i=" +i);
    }
}
