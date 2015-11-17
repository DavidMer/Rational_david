public class Rational{
    private int numerator;
    private int denominator;
    public Rational(){
	numerator = 0;
	denominator =1;
    }
    public Rational(int num, int den){
	if (den==0){
	    System.out.print("Denominator cannot be zero");
	    denominator=1;
	    numerator=0;
	    return;
	}
	numerator=num;
	denominator=den;
    }
    public String toString(){
	return numerator +"/"+ denominator;
    }
    public double floatValue(){
	return (double) numerator / denominator;
    }
} 
