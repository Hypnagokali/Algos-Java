package de.xenadu.algos;

public class Main {

	public static void main(String[] args) {
		int[] myArray = {7, 6, 10, 1, 2, 5, 4, 3, 9, 8};
		Sorter sorter = new Sorter(myArray);
		sorter.useQuickSort();
		
		for(int i = 0; i < myArray.length; i++) {
			if (i == myArray.length - 1) {
				System.out.print(myArray[i] + " THE END");
			} else {
				System.out.print(myArray[i] + ", ");
			}
		}			
	}

}
