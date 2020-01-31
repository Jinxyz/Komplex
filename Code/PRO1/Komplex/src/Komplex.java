public class Komplex {
    private double a;
    private double b;

    public Komplex(double re, double im) {
        this.a = re;
        this.b = im;
    }

    public void Add() {
        Komplex z1 = new Komplex(a, b);
        Komplex z2 = new Komplex(c, d);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}