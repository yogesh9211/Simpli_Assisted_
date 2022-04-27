
public class SelectionSortDemo {
	void sort(int array[])
	{
	int n = array.length;
	for (int i = 0; i < n-1; i++)
	{
	int min_element = i;
	for (int j = i+1; j < n; j++)
	if (array[j] < array[min_element])
	min_element = j;
	int temp = array[min_element];
	array[min_element] = array[i];
	array[i] = temp;
	}
	}
	void printarrayay(int array[])
	{
	int n = array.length;
	for (int i=0; i<n; ++i)
	System.out.print(array[i]+" ");
	System.out.println();
	}

	public static void main(String[] args) {
		
		SelectionSortDemo obj = new SelectionSortDemo();
		int array[] = {25,15, 10, 80, 53, 36,5,2,33};
		obj.sort(array);
		System.out.println("Sorted array");
		obj.printarrayay(array);

	}

}
