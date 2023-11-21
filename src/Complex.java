import java.util.Scanner;
public class Complex {
    private double re; // вещественная часть
    private double im; // мнимая часть

    public Complex(double re, double im){
        this.re = re;
        this.im = im;
    }
    public Complex sum(Complex c1, Complex c2){ //метод сложения
        return new Complex(c1.re + c2.re, c1.im + c2.im);
    }

    public Complex sub(Complex c1, Complex c2){ //метод вычитания
        return new Complex(c1.re - c2.re, c1.im - c2.im);
    }

    public Complex mult(Complex c1, Complex c2){ //метод умножения
        return new Complex(c1.re * c2.re - c1.im * c2.im, c1.re * c2.im + c1.im * c2.re);
    }


}
