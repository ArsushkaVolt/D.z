import java.util.Scanner;
public class Complex {
    private double re; // вещественная часть
    private double im; // мнимая часть

    public Complex(double re, double im){
        this.re = re;
        this.im = im;
    }
    public static Complex sum(Complex c1, Complex c2){ //метод сложения
        return new Complex(c1.re + c2.re, c1.im + c2.im);
    }

    public static Complex sub(Complex c1, Complex c2){ //метод вычитания
        return new Complex(c1.re - c2.re, c1.im - c2.im);
    }

    public static Complex mult(Complex c1, Complex c2){ //метод умножения
        return new Complex(c1.re * c2.re - c1.im * c2.im, c1.re * c2.im + c1.im * c2.re);
    }

    public static Complex div(Complex c1, Complex c2){
        Complex chisl = Complex.mult(c1, c2.sopr());
        double znam = Complex.mult(c2, c2.sopr()).re;
        return new Complex(chisl.re / znam, chisl.im / znam);
    }

    public Complex sopr() {
        return new Complex(this.re, -this.im);
    }

    public static boolean equals(Complex c1, Complex c2){
        double rc1 = Math.sqrt(Math.pow(c1.re, 2) + Math.pow(c1.im, 2));
        double rc2 = Math.sqrt(Math.pow(c2.re, 2) + Math.pow(c2.im, 2));
        return rc1 == rc2;
    }

    @Override
    public String toString(){
        return im >= 0 ? re + "+" + im + "i": re + "" + im + "i";
    }

}
