
public class ArrayDemo {

	public static void main(String[] args) {
		//singledimensional array
		int a[]= {10,20,30,40,50,54,85,78};
		for(int i=0;i<a.length-1;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}
		
		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8,4,7}, 
		            {3, 6, 9,3} };
		      
		      System.out.println("Length of row 1: " + b[0].length);
		      System.out.println("Length of row 1: " + b[1].length);
		      }
	}
