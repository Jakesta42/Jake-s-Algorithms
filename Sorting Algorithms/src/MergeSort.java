public class MergeSort{

	public static void mergeSort(int[] arr, int left, int right){

		if(right > left){		
			//Base case: If the size of the array is greater than 1, continue with the splitting. 
			int middle = (left + right) / 2; 	
			//Index for the middle of the set

			mergeSort(arr, left, middle);		
			//Split the left side of the array into little arrays of size 1
			mergeSort(arr, middle + 1, right);	
			//Split the right side of the array into little arrays of size 1

			merge(arr, left, middle, right);	
			//Merge every sub-array into the sub-array adjacent to it
			//Note: This method is called multiple times
		}			
	}
	public static void merge(int[] arr, int left, int middle, int right){

		int[] tempArray = new int[arr.length];    //Temporary array that does not change, identical to actual array

		for(int i = 0; i < arr.length; i++){
			tempArray[i] = arr[i];		//Copy all elements into temporary array
		}

		int i = left;			//Changing index for left part of temporary array
		int j = middle + 1;		//Changing index for middle part of temporary array
		int k = left;		//Another changing index for left part of permanent array

		while(i <= middle && j <= right){	//Keep going until the array is completed
			if(tempArray[i] <= tempArray[j]){
				/*
				 * If the number at the left is less than the number with at the middle,
				 * then put the number at tempArray[i] in the next index of arr.
				 */
				arr[k] = tempArray[i];
				k++;
				i++;
			}
			else{
				/*
				 * If the number at index middle is less than the number at index 								 * left, then put the number at tempArray[j] in the next index of arr.
				 */
				arr[k] = tempArray[j];
				k++;
				j++;
			}
		}
		/*
		 * If j < right, then the above condition is not met. In that case, there are 		
		 * excess numbers on the left side of the array that need to be put in. The  numbers on the left side are 		 * in increasing order. 
		 */
		while(i <= middle){
			arr[k] = tempArray[i];
			k++;
			i++;
		}
	}
	public static void mergeSortTesting(int[] arr){		//Doesn't actually belong here. Just for testing purposes.
		mergeSort(arr, 0, arr.length-1);
	}
}
