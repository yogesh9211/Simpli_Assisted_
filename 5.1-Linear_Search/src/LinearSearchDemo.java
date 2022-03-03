import java.util.Scanner;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter element to search:");
			int x =sc.nextInt();
			
			int result = LinearSearchDemo.linearSearch(arr, x);
			if(result<0) {
				System.out.println("Element not found in array:");
			} else {
				System.out.println("Element found in array at index :"+result);
			}
		}
	}
	
	
	public static int linearSearch(int[] arr, int x) {
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
