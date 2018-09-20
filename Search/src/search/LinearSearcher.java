package search;

public class LinearSearcher implements Searcher {

	@Override
	public int makeSearch(int[] array, int key) {
		int positionOfKey = -1;
		for (int i=0; i<array.length; i++) {
			if(array[i] == key) {
				positionOfKey = i;
			}
		}
		return positionOfKey;
	}

	@Override
	public int makeSearch(int[] array, int left, int right, int key) {
		return 0;
	}
}
