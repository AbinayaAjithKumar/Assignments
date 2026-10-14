package weeklyassignments;

public class Array_FindingSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {12, 45, 7, 89, 34, 89, 56, 33};
		int maxi=Integer.MIN_VALUE;
		int SecondMax=Integer.MIN_VALUE;
		for(int index=0;index<num.length-1;index++)
		{
			if(num[index]>maxi)
			{
				SecondMax=maxi;
				maxi=num[index];
			}
			else if (num[index]>SecondMax && num[index]<maxi)
			{
				
				SecondMax=num[index];
			}
		}
		System.out.println("max Value is: " + maxi);
		System.out.println("second Max value is: " + SecondMax);
		
	}

}
