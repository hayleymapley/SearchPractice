package search;

public class BinarySearcher implements Searcher {

	//To search the whole array, set the leftBound = 0, rightBound = array.length-1
	@Override
	public int makeSearch(int[] array, int leftBound, int rightBound, int key) {
	
		if (rightBound>=leftBound) {
			int mid = leftBound + (rightBound-leftBound)/2;
			//Return mid if key is mid element
			if (array[mid] == key) {
				return mid;
			}
			//If element is smaller than mid, then it must be in left subarray
			if (array[mid] > key) {
				return makeSearch(array, leftBound, mid-1, key);
			}
			//Otherwise the element must be in the right subarray
			return makeSearch(array, mid+1, rightBound, key);
		}
		//If element is not present
		return -1;
	}

	@Override
	public int makeSearch(int[] array, int key) {
		return 0;
	}
}
