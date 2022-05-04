package com.zahid;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
	
	/// # # # QuickSort in ascending order [1,2,3...n]
	/// c/c++ style function and variables 
	public static int partitionAsc(int[] A, int low, int high) {
	    int pivot = A[(low+high)/2];
	    int i = low-1;
	    int j = high+1;
	    int temp;

	    while(true)
	    {
	        while(A[++i] < pivot);
	        while(A[--j] > pivot);

	        if(i>=j) return j;
	        
		    temp = A[i];
		    A[i] = A[j];
		    A[j] = temp;

	    }
	}
	
	/// actual quickSort method using hoare partition
	public static void quickSortAsc(int[] arr, int low, int high) {
		
	    int p = partitionAsc(arr, low, high);
	    if(low >= high) return;

	    quickSortAsc(arr, low, p);
	    quickSortAsc(arr, p+1, high);
	}
	
	/// # # # QuickSort in ascending order [1,2,3...n]
	/// c/c++ style function and variables 
	public static int partitionDesc(int[] A, int low, int high) {
		int pivot = A[(low+high)/2];
		int i = low-1;
		int j = high+1;
		int temp;
		
		while(true)
		{
			while(A[++i] > pivot);
			while(A[--j] < pivot);
			
			if(i>=j) return j;
			
			temp = A[i];
			A[i] = A[j];
			A[j] = temp;
			
		}
	}
	
	/// actual quickSort method using hoare partition
	public static void quickSortDesc(int[] arr, int low, int high) {
		
		int p = partitionDesc(arr, low, high);
		if(low >= high) return;
		
		quickSortDesc(arr, low, p);
		quickSortDesc(arr, p+1, high);
	}
	
	
	// # # dummy method to pass list to actual quick sort
	// java style code
	public List<Integer> sortList(List<Integer> L, boolean descOrder) {
		
		if(L.size() == 0)
			return List.of();

		int[] A = new int[L.size()]; // wrapper list for primitive array conversion
		for(int i=0; i<L.size(); i++)
			A[i] = L.get(i);

		int n = L.size();
		
		if(descOrder == false)
			quickSortAsc(A, 0, n-1);
		else if(descOrder == true)
			quickSortDesc(A, 0, n-1);

		List<Integer> sortedList = new ArrayList<>(); // primitive array for wrapper list conversion
		for(int num: A) 
			sortedList.add(num);
		
		return sortedList;
	}
	
}
