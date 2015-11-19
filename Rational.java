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

   
    public static int lcm(int a,int b){
	if (a > b){
	    if (a%b) == 0 {return a}
	    else{ return lcm(a*2,b) }
	}

	else {
	    if (b%a) == 0 {return b}
	    else{ return lcm(b*2,a) }
	}
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
    public void  add(Rational other){
    	//must be void!
	int lcm = 0;
	if (denominator > other.denominator) {
	    lcm = lcm(denominator,other.denominator);
	}
	else {
	    lcm = lcm(other.denominator,denominator);
	}
	numerator = numerator * (gcd/denominator);
	numerator += other.numerator*(gcd/other.denominator);
	denominator = gcd;
	Rational r = new Rational(numerator,denominator);
	return r;
    }
    public static void main(String[] args) {
	Rational r = new Rational(2,3); //Stores the rational number 2/3
	Rational s = new Rational(1,2); //Stores the rational number 1/2
	Rational t = new Rational(4,18); //Stores the rational number 4/18
	System.out.println(r.add(s));  //Adds r to s, changes r to 7/6.  s remains 1/2
	t.reduce(); //Changes t to 2/9
    }

}
//david is poop
