package dailyassignments;

public class Debugger_SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] arr = {0, 0, 0, 0, 0};

		        int largest = -1;
		        int secondLargest = -1;

		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] > largest) {
		                secondLargest = largest;
		                largest = arr[i];
		            } else if (arr[i] > secondLargest && arr[i] != largest) {
		                secondLargest = arr[i];
		            }
		        }

		        System.out.println("Second Largest: " + secondLargest);
		    }

	}


