public class SortTester
{
	public static void main(String[] args)
	{
		int[] array = {2, 4, 3, 1, 5};
		
		printArray(array);
		
		SortExample sortInstance = new SortExample(array);
		sortInstance.sortingArray();
		
		System.out.println("");
		
		printArray(sortInstance.arrayInt);
		
	}
	
	static void printArray(int[] array)
	{
		for(int i=0; i < array.length; i++)
		{
			System.out.print("Element [" + i + "] = " + array[i] + "\n");
		}
	}
}
