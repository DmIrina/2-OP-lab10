package task1;

public class Counter {
    public static double calc7(double a, double b, double c, double d){
        return Math.pow(4*Math.cosh(Math.sqrt(Math.abs(a/b)))+3*Math.acos(d),c);
    }

    public static double calc8(double a, double b, double c, double d){
        return 5*a/Math.sin(a)+Math.sqrt(Math.tanh(Math.abs(b)*c)/Math.log(d));
    }

    public static double calc9(double a, double b, double c, double d){
        return (Math.sin(Math.abs(a))+Math.cos(Math.sqrt(b)))/(2*Math.tan(c)+Math.pow(Math.E,d));
    }
}