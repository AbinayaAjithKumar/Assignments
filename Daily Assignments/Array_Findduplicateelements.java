package dailyassignments;

public class Array_Findduplicateelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]={10, 20, 30, 20, 40, 10, 50, 30, 60};
		int duplicate[]= new int[num.length];
		int check=0;
		int index=0;
		
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=1;j<num.length-1;j++)
			{		
			 if(num[i]==num[j])
			 {
				 for (int k=0;k<duplicate.length;k++)
				 {
					 	if(duplicate[k]==num[i])
					 	{
					 		check=1;
					 		break;
					 	}
					 	
					 	
				 }if (check==0)
				 {
					 duplicate[index]=num[i];
					 index++;
				 }
				 check=0;
			 }
		}

	}
    System.out.print("Dublicate: ");
    for(int i=0;i<duplicate.length;i++)
    {
    	if (duplicate[i]!=0)
    	{
    		System.out.print(duplicate[i]+ " ");
    	}
    }
	}
}
