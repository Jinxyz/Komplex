public class Komplex {
    private double re;
    private double im;

    public Komplex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getImaginary() {
        return im;
    }

    public double getReal() {
        return re;
    }

    public Komplex Add(Komplex b) {
        double real = this.getReal() + b.getReal();
        double imag = this.getImaginary() + b.getImaginary();

        return new Komplex(real, imag);
    }

    public Komplex multi(Komplex b){
        double real = (this.getReal() * b.getReal()) - (this.getImaginary()*b.getImaginary());
        double imag = (b.getReal() * this.getImaginary()) + (this.getReal() * b.getImaginary());
         return new Komplex(real, imag);
     }

    public Komplex arg(Komplex b){
        if (this.getReal() > 0){
            double arctan = (this.getImaginary() / this.getReal());
        }
        else if (this.getImaginary() >= 0 || this.getReal() < 0){
            double arctan = (this.getImaginary() / this.getReal()) + Math.PI;
        }
        else if (this.getImaginary() < 0 || this.getReal() < 0){
            double arctan = (this.getImaginary() / this.getReal()) + Math.PI;
        }
        else if (this.getImaginary() > 0 || this.getReal() = 0){
            double arctan = Math.PI / 2;
        }
        else if (this.getImaginary() < 0 || this.getReal() = 0){
            double arctan = -(Math.PI / 2);
        }
        else if (this.getImaginary() = 0 || this.getReal() = 0){
            System.out.println("Undefined");
        }
    }


    @Override
    public String toString() {
        return "Komplex = " + re +  ", " + im + "i";
    }
}