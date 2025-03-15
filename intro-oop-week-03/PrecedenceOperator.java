public class PrecedenceOperator {
    public static void main(String[] args) {
//        int i =2;
//        boolean answer =(i<5) || (i<3) && (++i<3);
//        System.out.println("i = " + i);
//        System.out.println("answer = " + answer);
        int i =2;
        boolean answer =(i>5) && (i>3) || (i++<3);
        System.out.println("i = " + i);
        System.out.println("answer = " + answer);

    }
}
