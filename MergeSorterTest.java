import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * JUnit Tester Class
 * @author Dylan Decker
 */

import org.junit.Test;

public class MergeSorterTest {

	@Test
	public void testMergeSort() {
		// fail("Not yet implemented");
	}

	@Test
	public void testMerge() {
		// test case
		int[] testArray = {2, 3, 1};
		MergeSorter.merge(testArray, 0, 1, 2);
		int[] sorted = {1, 2, 3};
		assertTrue(Arrays.equals(testArray, sorted));
		
		// int[] test2 = {0, 0, 0, -1, 0, 2, 3, 6, 1, 4, 5, 0, 0, 0, 0};
		// int[] post2 = {0, 0, 0, -1, 0, 1, 2, 3, 4, 5, 6, 0, 0, 0, 0};
		// MergeSorter.merge(test2, 3, 7, 10);
		// for (int elem : test2) {
		//	System.out.print(elem + " ");
		// }
		// assertTrue(Arrays.equals(post2,  test2));
		
		// int[] test3 = {0, 0, 0, -1, 0, 2, 1, 3, 5, 0, 0, 0};
		// int[] post3 = {0, 0, 0, -1, 0, 1, 2, 3, 5, 0, 0, 0, 0};
		// MergeSorter.merge(test3, 3, 5, 8);
		// for (int elem : test3) {
		//	System.out.print(elem + " ");
		// }
		// assertTrue(Arrays.equals(test3,  post3));

	
	 int[] test4 = {0, 0, 0, -1, 0, 2, 3, 1, 6, 4, 0, 0, 0, 0};
	int[] post4 = {0, 0, 0, -1, 0, 1, 2, 3, 4, 6, 0, 0, 0, 0};
	MergeSorter.merge(test4, 3, 6, 9);
	for (int elem : test4) {
		System.out.print(elem + " ");
	}
	assertTrue(Arrays.equals(post4,  test4));
}
	
	@Test
	public void testMerge2() {
		// test case
		int[] testArray = {-3, 3, 1};
		MergeSorter.merge(testArray, 0, 1, 2);
		int[] sorted = {-3, 1, 3};
		assertTrue(Arrays.equals(testArray, sorted));
	}
	}


