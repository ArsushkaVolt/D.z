import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex(1, 1);
        Complex complex2 = new Complex(2, 2);
        System.out.println(Complex.sum(complex1, complex2));
        System.out.println(Complex.sub(complex1, complex2));
        System.out.println(Complex.mult(complex1, complex2));
        System.out.println(Complex.div(complex1, complex2));
        System.out.println(Complex.equals(complex1, complex2));
        System.out.println(complex2.sopr());
    }
}