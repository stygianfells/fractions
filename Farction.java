
//in the state: numerator and denominator (ints)
//constructors: default, overloaded a) takes 2 ints and b) takes a String, 
//copy constructor
//accessor and mutator
//make sure denominator is NOT EVER ZERO god forbid aaaaah
//driver class

//use indexOf to find slash in input string
//parsint gets you an int from a string

public class Farction {
    private int num, denom;

    //constructors different params
    public Farction() {
        num = 1;
        denom = 1;
    }
    public Farction(int n, int d) {
        num = n;
        setDenominator(d);
    }
        public Farction(Farction f) {
        num = f.num;
        denom = f.denom;
    }
    
    //printing the farction
    public Farction(String input) {
        int index = input.indexOf("/");
        String numString = input.substring(0, index);
        String denomString = input.substring(index+1);

        num = Integer.parseInt(numString);
        int den = Integer.parseInt(denomString);
        setDenominator(den);
    }

    //accessors
    public int getNumerator() {
        return num;
    }
    public int getDenominator() {
        return denom;
    }
    //mutators
    public void setNumerator(int n) {
        num = n;
    }
    public void setDenominator(int d) {
        if (d != 0) {
           denom = d;
        } else {
            denom = 1;
            System.out.println("loser");
        }
    }
    
    //the almighty toString
    public String toString() {
        return num + "/" + denom;
    }
    
    //as;dljfasa;dkslf static haha
    public static Farction mult (Farction a, Farction b) {
        Farction fart = new Farction(a.num*b.num, a.denom*b.denom);
        fart.simplify();
        return fart;
    }
    //mutator
    public void multiply (Farction a) {
        num *= a.num;
        denom *= a.denom;
    }
    
    //gcf gfc jfc kfc
    public int gcf(int a, int b) {
        int gfc = 0;
        a = Math.abs(a);
        b = Math.abs(b);
        
        if (a == 0 || b == 0) return 1;
        while (a!=b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        
        return b;
    }
    //simplify fraction
    public void simplify() {
        int gcf = gcf(num, denom);
        num /= gcf;
        denom /= gcf;
    }
}