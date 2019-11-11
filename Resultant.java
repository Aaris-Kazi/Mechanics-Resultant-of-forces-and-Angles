import java.util.*;
import java.lang.Math;
class Resultant
{
	public static void main(String[] args) 
	{
		Double X,Y,R,A,B,Result,I;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the submation of X");
		X = sc.nextDouble();
		System.out.println("Enter submation of Y");
		Y = sc.nextDouble();
		A = X*X;
		B = Y*Y;
		R = A+B;
		System.out.println("Resultant is:"+Math.sqrt(R));
		I = Y/X;
		Result = Math.atan(I);
		Result = Math.toDegrees(Result);	
		System.out.println("Angle is:"+Result);

	}
}