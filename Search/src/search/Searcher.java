package search;

public abstract class Searcher {

	public abstract void callSearch(int[] array, int key);

	public abstract int makeSearch(int[] array, int key);

	public abstract int makeSearch(int[] array, int left, int right, int key);

	public void printPositionOfKey(int key, int position) {
		if (position >= 0) {
			System.out.println("The key " + key + " is at position " + position + ".");
		} else {
			System.out.println("The key " + key + " is not present.");
		}
	}
}
