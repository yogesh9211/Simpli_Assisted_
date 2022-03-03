import java.util.Arrays;
import java.util.Scanner;

public class OrderStaticsticsDemo {
	public static void main(String[] args) {
		int[] arr = { 12, 2, 1, 5, 78, 5, 3 };

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter kth element to search in array:");
			int k = sc.nextInt();
			
			int result = OrderStaticsticsDemo.kthSmallestElement(arr, k);
			System.out.println("result:" + result);	
		}
	}

	static int kthSmallestElement(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}

}
