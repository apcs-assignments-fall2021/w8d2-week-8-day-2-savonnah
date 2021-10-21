public class Rational {
    // instance variables: every Rational object will have its own copy
    // of these variables
    public int numerator;
    public int denominator;
    
    /**
     * Constructor: the special method that will actually create a new Rational
     * object
     * Constructors are always public
     * Constructors have the same name as the class
     * Constructors have no return type
     */
    public Rational(int a, int b) {
        numerator = a;
        denominator = b;
    }
    
    // This method takes two Rationals, add them up,
    // and returns a Rational equal to the sum
    // You will need to:
    // 1) Calculate the value of the new numerator
    // 2) Calculate the value of the new denominator
    // 3) Create a new Rational variable with the two above values
    // 4) Return your new Rational variable
    // (When you write the simplify method later on, you should
    // also call it in this method to return the simplified result)
    public static Rational add(Rational r, Rational s) {
        int rnum = r.numerator;
        int rden = r.denominator;
        int snum = s.numerator;
        int sden = s.denominator;
        int nume1 = rnum*sden;
        int nume2 = snum*rden;
        int den = rden*sden;
        int num = nume1+nume2;
        Rational t = new Rational(num, den);
        Rational simpadd = Rational.simplify(t);

        return simpadd;
    }

    // This method takes two Rationals, subtracts thems up, 
    // and returns a Rational equal to the difference
    public static Rational subtract(Rational r, Rational s) {
        int rnum = r.numerator;
        int rden = r.denominator;
        int snum = s.numerator;
        int sden = s.denominator;
        int nume1 = rnum*sden;
        int nume2 = snum*rden;
        int den = rden*sden;
        int num = nume1-nume2;
        Rational t = new Rational(num, den);
        Rational simpsub = Rational.simplify(t);

        return simpsub;
    }
    
    public static Rational multiply(Rational r, Rational s) {
        int rnum = r.numerator;
        int rden = r.denominator;
        int snum = s.numerator;
        int sden = s.denominator;
        int den = rden*sden;
        int num = rnum*snum;
        Rational t = new Rational(num, den);
        Rational simpmult = Rational.simplify(t);

        return simpmult;
    }
    
    public static Rational divide(Rational r, Rational s) {
        int rnum = r.numerator;
        int rden = r.denominator;
        int snum = s.numerator;
        int sden = s.denominator;
        int den = rden*snum;
        int num = rnum*sden;
        Rational t = new Rational(num, den);
        Rational simpdiv = Rational.simplify(t);

        return simpdiv;
    }

    // Finds the greatest common factor between a and b
    // To find the greatest common factor, find the largest number x
    // such that a and b are both multiples of x
    public static int greatestCommonFactor(int a, int b){
        int largenum = Math.max(a,b);
        int gcf = 1;
        for(int i = 1; i<=largenum; i++){
            if(a%i == 0 && b%i == 0){
                gcf = i;
            }
        }
        return gcf;
    }

    // This method is given a rational, and returns a simplified version
    // of the input rational
    // Use the greatestCommonFactor method here
    // e.g. simplify(2/4) => 1/2
    //      simplify(1/2) => 1/2
    public static Rational simplify(Rational r) {
        int rnum = r.numerator;
        int rden = r.denominator;
        int gcf = Rational.greatestCommonFactor(rnum, rden);
        int newnum = rnum/gcf;
        int newden = rden/gcf;
        Rational t = new Rational(newnum, newden);

        return t;
    }

    // This following method is NOT static, we'll talk about it next class!
    // This returns a string representation of a Rational (e.g. "1/2")
    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}













