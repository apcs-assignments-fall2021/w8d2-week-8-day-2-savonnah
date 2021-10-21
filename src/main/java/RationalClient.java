public class RationalClient {
    
    public static void main(String[] args) {
        Rational r = new Rational(1, 2);
        System.out.println(r); // 1/2

        // We can use dot notation to access the integer values
        // of the numerator and denominator directly
        System.out.println(r.numerator); // 1
        System.out.println(r.denominator); // 2

        // A basic test for adding Rationals
        System.out.println("addition");
        Rational s = new Rational(1, 3);
        System.out.println(s); // 1/3
        Rational t = Rational.add(r, s);
        System.out.println(t); // 5/6
        Rational another = new Rational(1, 4);
        Rational another1 = new Rational(1, 4);
        Rational ano = Rational.add(another, another1);
        System.out.println(ano); // 1/2

        System.out.println("substraction");
        Rational x = Rational.subtract(r, s);
        System.out.println(x); // 1/6
        Rational anot = new Rational(6, 12);
        Rational anot1 = new Rational(12, 12);
        Rational anott1 = Rational.subtract(anot, anot1);
        System.out.println(anott1); // -1/2

        System.out.println("multiplication");
        Rational y = Rational.multiply(r, s);
        System.out.println(y); // 1/6
        Rational anoth = new Rational(1, 2);
        Rational anoth1 = new Rational(2, 4);
        Rational anotth1 = Rational.multiply(anoth, anoth1);
        System.out.println(anotth1); // 1/4

        System.out.println("division");
        Rational z = Rational.divide(r, s);
        System.out.println(z); // 3/2
        Rational anothe = new Rational(1, 2);
        Rational anothe1 = new Rational(2, 4);
        Rational anotthe1 = Rational.divide(anothe, anothe1);
        System.out.println(anotthe1); // 1/1

        System.out.println("simplify");
        Rational q = new Rational(1, 2);
        Rational w = Rational.simplify(q);
        System.out.println(w); // 1/2
        Rational e = new Rational(2, 4);
        Rational o = Rational.simplify(e);
        System.out.println(o); // 1/2

        System.out.println("GCF");
        int test = Rational.greatestCommonFactor(24, 36);
        System.out.println(test); // 12
//
//        // A more advanced test for adding Rational that won't work
//        // until the greatestCommonFactor and simplify methods work
//        Rational x = new Rational(1, 6);
//        Rational y = Rational.add(t, x);
//        System.out.println(y); // 1/1
    }
}
