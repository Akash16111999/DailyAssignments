import java.util.*;
public class RemoveElement {
	
	static int[] removeElement(int[] arr, int size, int index) {
		if (arr == null || index < 0 || index >= size)
			return arr;
		int[] newArr = new int[size-1];
		for (int i= 0, k = 0; i < size; i++) {
			if (i == index) 
				continue;
			newArr[k++] = arr[i];
		}
		return newArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.print("Enter the index of element to delete: ");
		int idx = sc.nextInt();
		
		arr = removeElement(arr, n, idx);
		System.out.println("Resultant array: " + Arrays.toString(arr));
		
		sc.close();
	}

}