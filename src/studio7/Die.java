package studio7;

public class Die {
private int sides;

public Die (int sides) {
	this.sides = sides;
}
public int landed () {
int sLand =	(int) Math.random()*sides +1;
System.out.println("Landed on:" + sLand);
return sLand;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Die A = new Die (6);
A.landed();
	}

}
