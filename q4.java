package assignment1;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>=n-1 && i<=6 && j<=14 || i>=j && i<=6 && j<=7||i==7 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");   
				}
	        }
			System.out.println("");
		}

}
}
