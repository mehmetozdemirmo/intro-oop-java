public class DivisionDemo {
    public static void main(String[] args) {
        divide(9,0);
    }
    public static void divide(int operand1, int operand2){
        if (operand2 !=0){
            System.out.println(operand2 + "is not zero");
            System.out.println("Result = " + operand1/operand2);
        }
        else {
            System.out.println(operand2 + "is zero");
        }
    }
}
