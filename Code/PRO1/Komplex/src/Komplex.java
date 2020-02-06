public class Komplex {
    private double re;
    private double im;

    public Komplex(double rea, double ima) {
        this.re = rea;
        this.im = ima;
    }

    public double getImaginary() {
        return im;
    }

    public double getReal() {
        return re;
    }

    public Komplex Add(Komplex b) {
        double real = this.getReal()+b.getReal();
        double imag = this.getImaginary()+b.getImaginary();


        return new Komplex(im, re);
    }

    @Override
    public String toString(){
        return "Tal = " + re + ", " + im + "i";
    }

}