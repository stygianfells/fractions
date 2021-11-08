
public class fractionedDriver {
    public static void main(String[] args) {
        Farction f1 = new Farction(4, 5);
        Farction f2 = new Farction(9, 8);
        
        Farction[] fractions = new Farction[4];
        fractions[0] = new Farction();
        fractions[1] = new Farction(2, 6);
        fractions[2] = new Farction("3/7");
        fractions[3] = new Farction(f1);
        
        int i;
        for (i = 0; i < 4; i++) {
            System.out.println(fractions[i]);
        }
        
        System.out.println(Farction.mult(f1, f2));
        System.out.println(f1.gcf(45, 35));
        //f1.toString();
    }
}