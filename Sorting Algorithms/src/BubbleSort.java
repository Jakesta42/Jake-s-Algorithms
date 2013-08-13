
public class BubbleSort{

	public static void bubbleSort(int[] arrayToSort){

		int temp;
		for(int g = 0; g < arrayToSort.length - 1; g++){

			for(int i = 0; i < arrayToSort.length -1 ; i++){ 
				//Need to iterate over all numbers multiple times

				if(arrayToSort[i] > arrayToSort[i+1]){
					temp = arrayToSort[i];
					arrayToSort[i] = arrayToSort[i+1];
					arrayToSort[i+1] = temp;
				}
			}
		}
	}
}