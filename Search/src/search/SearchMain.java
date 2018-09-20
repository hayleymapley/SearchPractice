package search;

public class SearchMain {
	
	private static int[] array = new int[] {1, 3, 5, 7, 9};
	
	public static void main(String[] args) {
		int key = 7;
		
		BinarySearcher bSearch = new BinarySearcher();
		LinearSearcher lSearch = new LinearSearcher();
		
		System.out.println("Result of linear search:");
		System.out.println("Pos: " + lSearch.makeSearch(array, key));
		
		System.out.println("\nResult of binary search:");
		System.out.println("Pos: " + bSearch.makeSearch(array, 0, array.length-1, key));
		
	}
}
