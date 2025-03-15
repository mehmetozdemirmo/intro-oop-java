public class MathHypos {
    public static void main(String[] args) {
        double x,y,z,t;

        x=3;
        y=4;

        z=Math.sqrt (x*x+y*y);
        t=Math.sqrt (Math.pow (x,2)+Math.pow (y,2));
        System.out.println("Hypotenuse is z:" + z);
        System.out.println("Hypotenuse is t:" + t);
    }
}
