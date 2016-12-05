class BenchMarkMeth{
	public static void bubble(int[]arr){
		int[] temp= new int[arr.length];
		calculator.copyarray(temp,arr);
		long startTime=System.currentTimeMillis();
		SortingAlgos.bubblesort(temp);
		long endTime=System.currentTimeMillis();
		long totalTime= endTime - startTime;
		System.out.println("time to sort using bubble sort is " +totalTime+ "ms" );
	}
	public static void insertion(int[]arr){
		int[] temp= new int[arr.length];
		calculator.copyarray(temp,arr);
		long startTime=System.currentTimeMillis();
		SortingAlgos.insertionSort(temp);
		long endTime=System.currentTimeMillis();
		long totalTime= endTime - startTime;
		System.out.println("time to sort using insertion sort is " +totalTime+ "ms" );
	}
	public static void selection(int[]arr){
		int[] temp= new int[arr.length];
		calculator.copyarray(temp,arr);
		long startTime=System.currentTimeMillis();
		SortingAlgos.selectionsort(temp);
		long endTime=System.currentTimeMillis();
		long totalTime= endTime - startTime;
		System.out.println("time to sort using selection sort is " +totalTime+ "ms" );
	}

}