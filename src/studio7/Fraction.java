package studio7;

public class Fraction {
	private int numerator;
	private int denominator;

public Fraction (int numerator, int denominator) {
	this.numerator=numerator;
	this.denominator=denominator; 
}
public void print () {
	System.out.println(numerator+"/"+denominator);
}

public int getNum() {
	return numerator; 
}
public int getDenom() {
	return denominator;
}
public Fraction Add( Fraction other){
	int newNumerator1 = (this.numerator*(other.getDenom()));
	int newDenominator1 = (this.denominator*other.getDenom());
	int newNumerator2 = (other.getNum()*(this.denominator));
	int newDenominator2 = (this.denominator*other.getDenom());
	Fraction total =new Fraction ((newNumerator1 + newNumerator2), newDenominator1);
	return total; 
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stu

	}

}
