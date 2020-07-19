import java.util.*;

public class GitDemo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("The sum of the elements : "+sum);
	}
}
