public class InsertionSort{

	public static void insertionSort(int[] arrayToSort){

		for(int i = 1; i < arrayToSort.length; i++){	//Move up in index of array

			int j = i;  //Used for handling comparisons for each element individually 
			int temp = arrayToSort[i];	//Holds value on the right

			while(j > 0 && arrayToSort[j] < arrayToSort[j-1]){

				//If the value to the right is less than the value to the left, then you need to 			//move the value over one
				/*
				 * This part deals with one value. That value is compared to all the values left 			 * of it, and if it is less than the value to the right of it, the loop breaks  			 * and the algorithm moves on to the next element in the collection. 
				 */

				arrayToSort[j] = arrayToSort[j-1];		//Move the smaller one down place 
				arrayToSort[j-1] = temp;			//Put the bigger one up one place
				j--; //Move from right to left (Keep moving down until element found its place)

			}	
		}
	}
}