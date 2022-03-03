import java.util.Scanner;

public class ArrayRotationDemo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println("Before rotation:");
		ArrayRotationDemo.printArray(arr);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter k:");
			int k = sc.nextInt();
			int[] result = ArrayRotationDemo.rotate(arr, k);
			ArrayRotationDemo.printArray(result);
			
			int[] result1 = ArrayRotationDemo.leftRotate(arr, k);
			ArrayRotationDemo.printArray(result1);
			
		}
	}

	public static int[] rotate(int[] arr, int k) {
		int n = arr.length;
		int[] temp = new int[n];
		
		for(int i=0; i<n; i++) {
			temp[(i+k)%n] = arr[i];
		}
		return temp;
	}
	
	public static int[] leftRotate(int[] arr, int k) {
		int n = arr.length;
		int[] temp = new int[n];
		int s = n- (k%n);
		
		for(int i=0; i<n; i++) {
			temp[(i+s)%n] = arr[i];
		}
		return temp;
	}
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println("");
	}
}