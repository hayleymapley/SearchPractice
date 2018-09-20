package search;

public class SearchMain {
	
	private static int[] array = new int[] {1, 3, 5, 7, 9};
	
	public static void main(String[] args) {
		int key = 5;
		
		BinarySearcher bSearch = new BinarySearcher();
		LinearSearcher lSearch = new LinearSearcher();
		
		System.out.println("Result of linear search:");
		lSearch.callSearch(array, key);
		
		System.out.println("\nResult of binary search:");
		bSearch.callSearch(array, key);
		
	}
}
