package dailyassignments;

public class Poly_Findingshapes {
	
	//Area of a Circle = 3.14*r^2

	public static float calculateArea(int radius)
	{
		float circle=3.14f*radius*radius;
		return circle;
		
	}
	
	//Area of a rectangle = length*breadth
	public static float calculateArea(int length, int breadth)
	{
		int rectagle=length*breadth;
		return rectagle;		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Area of a Circle: " + calculateArea(5));
		System.out.println("Area of a Rectangle: " + calculateArea(8, 4));
		
		
		

	}

}
