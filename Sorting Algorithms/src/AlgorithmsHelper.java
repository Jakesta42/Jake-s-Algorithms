
public final class AlgorithmsHelper {
	private static int minimumRange = 0;
	private static int maximumRange;

	public static int[] generateRandomArray(){	//Generates a random int array of size random between 0 and 300
		int size = (int) ((Math.random() * 300) + 1);
		System.out.println("Generating array of size " + size + " in between the range of " + minimumRange + " and " + maximumRange + ".");
		int[] result = new int[size];
		
		for(int i = 0; i < size; i++){
			result[i] = (int) (((Math.random() * maximumRange) + minimumRange));
		}
		return result;
	}
	public static int[] generateRandomArray(int size, int upperLimit, int lowerLimit){
		int[] result = new int[size];
		
		for(int i = 0; i < size; i++){
			result[i] = (int) ((Math.random() * upperLimit) + lowerLimit);
		}
		return result;
	}
	public static int[] generateRandomArray(int size, int upperLimit){	//Now lower limit. Just start at 0
		int[] result = new int[size];
		
		for(int i = 0; i < size; i++){
			result[i] = (int) ((Math.random() * upperLimit));
		}
		return result;
	}
	public static void printArray(int[] arr){
		for(int i= 0 ; i < arr.length - 1; i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length-1] + ".");
	}
	public static boolean isSortedIncreasing(int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			if(!(arr[i] <= arr[i+1])){
				return false;
			}
		}
		return true;
	}
	public static boolean isSortedDecreasing(int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			if(!(arr[i] >= arr[i+1])){
				return false;
			}
		}
		return true;
	}
	public static void setMaximum(int m){
		maximumRange = m;
	}
	public static void setMinimum(int m){
		minimumRange = m;
	}
	
}
