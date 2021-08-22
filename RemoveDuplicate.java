package Week2Day2Assignment;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Test Leaf Selenium Web Driver  Selenium Test  Automation";
		int count=0;
		String[] char1 = text.split(" ");
		
		for(int i=0;i<char1.length;i++) 
		{
			for(int j=i+1;j<char1.length;j++)
			{
				if(char1[i].equals(char1[j]))
				{
					count =count+1;
					if(count>0)
					{	
						char1[j]=" ";
					}
				}
				
			}
			System.out.print(char1[i]+" "); 
		} 
			

	}

}
