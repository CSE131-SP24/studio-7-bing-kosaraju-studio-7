package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private int length;
	private int width;
public Rectangle (int length, int width) {
	this.length = length;
	this.width = width;
	}
		public void printR (){	
StdDraw.filledRectangle(length, length, width, width);
		}
		public boolean Square () {
			if (length == width) {
				System.out.println ("This is a square.");
			return true;
		}
		else {
			System.out.println("Not a square.");
			return false;}
		}
		
		public int Area () {
			int area = (length*width);
			System.out.println("This is area: " + area);
			return area;
		}
		
		public int perimeter () {
			int perimeter = ((length*2)+(width*2));
			System.out.println("Perimeter: " + perimeter);
			return perimeter;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle A = new Rectangle  (6,6);
		A.printR();
		A.Area();
		A.perimeter();
		A.Square();
;
		
	
	
	

	}}
