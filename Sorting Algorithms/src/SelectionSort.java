public class SelectionSort{	

	public static void selectionSort(int[] arrayToSort){

		for(int i = 0; i < arrayToSort.length - 1 ; i++){ 
			//Keep looping through the size of the array

			int minIndex = i;		//Initially set the minimum index equal to i (just to be 0 at first)
			int temp;

			//Compares right value with left value
			for(int rightValue = i + 1; rightValue < arrayToSort.length; rightValue++){ 
				if(arrayToSort[rightValue] < arrayToSort[minIndex]){  
					//If right value is less than the current minimum
					minIndex = rightValue;	//Set minimum index to the right value
				}
			}

			//The next part is only executed once minimum found 

			temp = arrayToSort[i];	//Hold left value in temp variable
			arrayToSort[i] = arrayToSort[minIndex]; //Set left value to the current minimum

			arrayToSort[minIndex] = temp;	
			//Only free spot in the array, need to put it there	
			//Move up one position in the array
		}		
	}
}