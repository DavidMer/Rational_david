public class Rational
{
    private int numerator;
    private int denominator;
    public Rational(){
        numerator = 0;
        denominator = 1;
    }
    public Rational(int num, int den){
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
    public String toString(){
        return numerator + "/" + denominator;
    }
    public double floatValue(){
        return (double)numerator / denominator;
    }

   
    public static int gcd(int p, int q) {
        if(p>q){
        if (q == 0) return p;
        else return gcd(q, p % q);
        }
        else{
        if (p == 0) return q;
        else return gcd(p, q % p);
         }
    }
    public int gcd() {
        if(denominator>numerator){
        if (denominator == 0) return numerator;
        else return gcd(denominator, numerator % denominator);
    }
        else{
             if (numerator == 0) return denominator;
            else return gcd(numerator, denominator % numerator);
        }
    }
    public void multiply(Rational other){
        numerator *= other.numerator;
        denominator *= other.denominator;
        reduce();
    }
    public void divide(Rational other){
        numerator *= other.denominator;
        denominator *= other.numerator;
        reduce();
    }
    public void reduce(){
        if(numerator > denominator){
        numerator= numerator/ gcd(numerator, denominator);
        denominator= denominator/gcd(numerator,denominator);
        return;
        }
        else{
        numerator= numerator/ gcd(numerator, denominator);
        denominator= denominator/gcd(numerator,denominator);
        return;
        }
        
    }
    public void  add(Rational other){
    	//must be void!
    	int lcm = 0;
    	lcm= denominator * other.denominator;
    	numerator = numerator * (lcm/denominator);
    	numerator += other.numerator*(lcm/other.denominator);
     denominator=lcm;	
    }
    
    public static void main(String[] args) {
	    Rational r = new Rational(2,3); //Stores the rational number 2/3
	    System.out.println(r.toString());
	    Rational s = new Rational(1,2); //Stores the rational number 1/2
    	System.out.println(s.toString());
    	Rational t = new Rational(4,18); //Stores the rational number 4/18
    	r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2
    	System.out.println(r.toString());
    	t.reduce(); //Changes t to 2/9
    	System.out.println(t.toString());
    }

}
//david is poop
