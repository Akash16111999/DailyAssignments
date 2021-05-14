import java.util.Scanner;

class EvenOddSum {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements :");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int even = 0, odd = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				even += arr[i];
			else
				odd += arr[i];
		}
		System.out.println("Even index positions sum: " + even);
		System.out.println("Odd index positions sum: " + odd);
		sc.close();
	}
}