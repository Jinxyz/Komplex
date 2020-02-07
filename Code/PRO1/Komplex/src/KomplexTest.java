public class KomplexTest {
    public static void main(String[] args) {
    Komplex a = new Komplex(3,2);
    Komplex b = new Komplex(4,1);

    // ADDITION
    Komplex c = a.Add(b);
        System.out.println(c);

        // MULTIPLICATION
        c = a.multi(b);
        System.out.println(c);
    }
}