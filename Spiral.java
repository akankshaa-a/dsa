import java.util.*;
public class Spiral {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter m and n"); //m rows, n columns
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println("Enter the array elements");
		int i,j,left,right,top,bottom,count=0;
		int arr[][]=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
				arr[i][j]=s.nextInt();
		}
		top=0;
		bottom=m-1;
		left=0;
		right=n-1;
		
		while(count<(m*n))
		{
			for(i=left;i<=right;i++)
			{
				System.out.print(arr[top][i]+" ");
				count++;
			}
			top++;
			
			for(i=top;i<=bottom;i++)
			{
				System.out.print(arr[i][right]+" ");
				count++;
			}
			right--;
			
			for(i=right;i>=left;i--)
			{
				System.out.print(arr[bottom][i]+" ");
				count++;
			}
			bottom--;
			
			for(i=bottom;i>=top;i--)
			{
				System.out.print(arr[i][left]+" ");
				count++;
			}
			left++;
		}
				
	}

}
