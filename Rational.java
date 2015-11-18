public class Rational
{
    private int numerator;
    private int denominator;
    public Rational()
    {
        numerator = 0;
        denominator = 1;
    }
    public Rational(int num, int den)
    {
        if (den == 0)
        {
            System.out.print("Denominator cannot be zero");
            numerator=0;
            denominator=1;
            return;
        }
        numerator=num;
        denominator=den;
        reduce();
    }
    public String toString()
    {
        return numerator + "/" + denominator;
    }
    public double floatValue()
    {
        return (double)numerator / denominator;
    }
    private int gcd(int a, int b)
    {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
    private void reduce()
    {
        int g = gcd(numerator, denominator);
        numerator /= g;
        denominator /= g;
    }
    public void multiply(Rational other)
    {
        numerator *= other.numerator;
        denominator *= other.denominator;
        reduce();
    }
    public void divide(Rational other)
    {
        numerator *= other.denominator;
        denominator *= other.numerator;
        reduce();
    }
}
//david is poop

