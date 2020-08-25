package de.xenadu.algos;

public class Sorter {
	
	private int[] _list;
	private boolean _isSorted;
	
	public Sorter(int[] list) {
		_list = list;
		_isSorted = false;
	}
	
	public int[] getList() {
		return _list;
	}
	
	public boolean isSorted() {
		return _isSorted;
	}
	

	private int quickSortDevide(int left, int right) {
		int greater = left;
		int less = right - 1;
		int pivot = right;
		
		while(greater < less) {
			while((_list[greater] < _list[pivot])
					&& (greater < right)) {
				greater += 1;
			}
			while((_list[less] > _list[pivot]) && (less > left)) {
				less -= 1;
			}
			
			if (greater < less) {
				// do the swap
				int cachedVal = _list[greater];
				_list[greater] = _list[less];
				_list[less] = cachedVal;
			}
		}
		
		// swap pivot with greater token if necessary
		if(_list[greater] > _list[pivot]) {
			int cachedVal = _list[greater];
			_list[greater] = _list[pivot];
			_list[pivot] = cachedVal;
		}
		
		return greater;
	}
	
	/*
	 * In-Place implementation of QuickSort
	 */
	private void quickSort(int left, int right) {
		if(left < right) {
			int divider = quickSortDevide(left, right);
			quickSort(left, divider - 1);
			quickSort(divider + 1, right);
		}
	}
	
	public void useQuickSort() {
		// quicksort in-place algo
		// if (this.isSorted()) return;
		// if (this._list == null || this._list.length < 2) return;
		int left = 0;
		int right = this._list.length - 1;
		quickSort(left, right);
		
		// now the list is sorted
		_isSorted = true;
	}
	
	public void useQuickSortOutOfPlace() {
		// quicksort out-of-place
	}
	
	public void useBucketSort() {
		// bucketsort
	}

}
