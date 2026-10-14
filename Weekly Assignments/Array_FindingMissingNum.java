package weeklyassignments;

public class Array_FindingMissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1, 2, 3, 5, 6, 7, 8, 9, 10};
		int totalSum=0;
		int expectedSum=0;
		
		{
			for(int i=0;i<arr.length;i++)
			{
				totalSum=totalSum+arr[i];
				
			}
			System.out.println("Total Sum: "+totalSum);
			for(int num=1;num<=10;num++)
			{
				expectedSum=expectedSum+num;
			}
			System.out.println("Expected Sum: "+expectedSum);
			
			int missingNumber=expectedSum-totalSum;
			System.out.println("Missing Number: "+missingNumber);
					
		}
	}

}
