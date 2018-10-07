package search;

public interface Searcher {

	//Search used by linearSearcher, requiring array and key value
	public int makeSearch(int[] array, int key);

	//Search used by BinarySearcher, requiring array and key value, with possibility
	//to edit the bounds that you wish to search
	public int makeSearch(int[] array, int left, int right, int key);
	
}
