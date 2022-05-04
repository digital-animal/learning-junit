package com.zahid;


import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
//import org.junit.Test;

@DisplayName("Testing Quick Sort For Different List Size")
public class QuickSortTest {
	
	QuickSort qs; // reference for quick sort
	List<Integer> unsortedList; // reference for unsorted list
	List<Integer> sortedList; // reference for sorted list
	
	public QuickSortTest() {
		// pass
	}
	
	@BeforeEach
	void init() {
		qs = new QuickSort(); // creating quick sort instance for each test
	}

	// # # testing quick sort for blank list
	@Nested
	@DisplayName("Testing Blank List")
	class BlankListTest {
		
		@BeforeEach
		void setUpBlankListTest() {
			
			unsortedList = List.of(); // creating blank list
			sortedList = qs.sortList(unsortedList, false); // sorting blank list			
		}
		
		@Test
		@DisplayName("Testing Whether Sorting Altered Original Data")
		void testListAlteration() {		
			
			assertTrue(Utility.equalLists(unsortedList, sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Ascending Order")
		void testAscendingSort() {

			assertTrue(Utility.sortedAscending(sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Descending Order")
		void testDesendingSort() {
			
			assertTrue(Utility.sortedDescending(sortedList));
		}
	}
	
	// # # testing quick sort for single element list
	@Nested
	@DisplayName("Testing Single Element List")
	class SingleElementListTest {

		@BeforeEach
		void setUpSingleElementListTest() {
			
			unsortedList = List.of(1); // creating single element list
			sortedList = qs.sortList(unsortedList, false); // sorting single element list			
		}
		
		@Test
		@DisplayName("Testing Whether Sorting Altered Original Data")
		void testListAlteration() {	

			assertTrue(Utility.equalLists(unsortedList, sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Ascending Order")
		void testAscendingSort() {

			assertTrue(Utility.sortedAscending(sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Descending Order")
		void testDesendingSort() {

			assertTrue(Utility.sortedDescending(sortedList));
		}
	}
	
	
	// # # testing quick sort for double element list
	@Nested
	@DisplayName("Testing Double Element List")
	class DoubleElementListTest {
		
		@BeforeEach
		void setUpDoubleElementListTest() {
			
			unsortedList = List.of(4, 9); // creating double element list
			sortedList = qs.sortList(unsortedList, false); // sorting double element list			
		}

		@Test
		@DisplayName("Testing Whether Sorting Altered Original Data")
		void testListAlteration() {	
		
			assertTrue(Utility.equalLists(unsortedList, sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Descending Order")
		void testAscendingSort() {
			
			assertTrue(Utility.sortedAscending(sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Descending Order")
		@Disabled
		void testDesendingSort() {
			
			assertTrue(Utility.sortedDescending(sortedList));
		}
	}
	
	
	// # # testing quick sort for random element list
	@Nested
	@DisplayName("Testing Random Element List")
	class RandomElementListTest {
		int n = 50; // size of random list
		int upperBound = 100; // upper bound of random list

		@BeforeEach
		void setUpRandomElementListTest() {
			
			unsortedList = Utility.generateRandomList(n, upperBound); // creating random element list
			sortedList = qs.sortList(unsortedList, false); // sorting random element list			
		}

//		@Test
		@RepeatedTest(5)
		@DisplayName("Testing Whether Sorting Altered Original Data")
		void testListAlteration() {
			
			assertTrue(Utility.equalLists(unsortedList, sortedList));
		}
		
//		@Test
		@RepeatedTest(5)
		@DisplayName("Testing Whether List Sorted in Ascending Order")
		void testAscendingSort() {
			
			assertTrue(Utility.sortedAscending(sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Descending Order")
		@Disabled
		void testDesendingSort() {
			
			assertTrue(Utility.sortedDescending(sortedList));
		}
	}
	
	
	// # # testing quick sort for already sorted list [ascending order]
	@Nested
	@DisplayName("Testing Sorted List [Ascending Order]")
	class AscendingSortedListTest {

		@BeforeEach
		void setUpAscendingSortedListTest() {

			unsortedList = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
			sortedList = qs.sortList(unsortedList, false); // sorting already sorted list			
		}
		
		@Test
		@DisplayName("Testing Whether Sorting Altered Original Data")
		void testListAlteration() {	
			
			assertTrue(Utility.equalLists(unsortedList, sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Ascending Order")
		void testAscendingSort() {
			
			assertTrue(Utility.sortedAscending(sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Descending Order")
		@Disabled
		void testDesendingSort() {
			
			assertTrue(Utility.sortedDescending(sortedList));
		}
	}
	
	
	// # # testing quick sort for already sorted list [descending order]
	@Nested
	@DisplayName("Testing Sorted List [Descending Order]")
	class DescendingSortedListTest {
		
		@BeforeEach
		void setUpDescendingSortedListTest() {
			
			unsortedList = List.of(15,14,13,12,11,10,9,8,7,8,6,5,4,3,2,1);
			sortedList = qs.sortList(unsortedList, false); // sorting already sorted list			
		}
		
		@Test
		@DisplayName("Testing Whether Sorting Altered Original Data")
		void testListAlteration() {	
			
			assertTrue(Utility.equalLists(unsortedList, sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Ascending Order")
		void testAscendingSort() {
			
			assertTrue(Utility.sortedAscending(sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Descending Order")
		@Disabled
		void testDesendingSort() {
			
			assertTrue(Utility.sortedDescending(sortedList));
		}
	}
	
	
	// # # testing quick sort for equal element list
	@Nested
	@DisplayName("Testing Equal Element List")
	class EqualElementListTest {
		int n = 50;
		int num = 2;
		
		@BeforeEach
		void setUpEqualElementListTest() {
			
			unsortedList = Utility.fillList(n, num); // creating equal element list
			sortedList = qs.sortList(unsortedList, false); // sorting equal element list			
		}
		
		@Test
		@DisplayName("Testing Whether Sorting Altered Original Data")
		void testListAlteration() {	

			assertTrue(Utility.equalLists(unsortedList, sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Ascending Order")
		void testAscendingSort() {

			assertTrue(Utility.sortedAscending(sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Descending Order")
		void testDesendingSort() {
			
			assertTrue(Utility.sortedDescending(sortedList));
		}
	}

	
	// # # testing quick sort for large list i.e. timeout test
	@Nested
	@DisplayName("Testing Large List [Timeout Test]")
	class LargeListTest {
		int n = 5_000_000;
		int bound = 10_000_000;	
		
		@BeforeEach
		void setUpLargeListTest() {
			
			unsortedList = Utility.generateRandomList(n, bound); // creating large list
			sortedList = qs.sortList(unsortedList, false); // sorting large list			
		}
		
		@Test
		@DisplayName("Testing Whether Sorting Altered Original Data")
		@Timeout(value = 10_000, unit = TimeUnit.MILLISECONDS)
		void testListAlteration() {

			assertTrue(Utility.equalLists(unsortedList, sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Ascending Order")
		@Timeout(value = 10_000, unit = TimeUnit.MILLISECONDS)
		void testAscendingSort() {
			
			assertTrue(Utility.sortedAscending(sortedList));
		}
		
		@Test
		@DisplayName("Testing Whether List Sorted in Descending Order")
		@Timeout(value = 10_000, unit = TimeUnit.MILLISECONDS)
		@Disabled("List Not Sorted in Descending Order")
		void testDescendingSort() {

			assertTrue(Utility.sortedDescending(sortedList));
		}
	}
}
