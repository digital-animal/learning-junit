package com.zahid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Utility {
	
	/// utility function check whether two list contains same elements
	public static boolean equalLists(List<Integer> L1, List<Integer> L2) {
		if(L1 == null && L2 == null)
			return true;
		
		if((L1 == null && L2 != null) || (L1 != null && L2 == null) || (L1.size() != L2.size()))
			return false;
		
		L1 = new ArrayList<>(L1);
		L2 = new ArrayList<>(L2);
		
		Collections.sort(L1);
		Collections.sort(L2);
		
		return L1.equals(L2);
	}
	
	/// utility function to check whether a list is sorted in ascending order
	public static boolean sortedAscending(List<Integer> L) {
		if(L == null || L.size() == 1)
			return true;
		
		for(int i=1; i<L.size(); i++) {
			
			if(L.get(i) >= L.get(i-1))
				continue;
			else
				return false;
		}
		
		return true;
	}
	
	/// utility function to check whether a list is sorted in descending order
	public static boolean sortedDescending(List<Integer> L) {
		
		if(L == null || L.size() == 1)
			return true;
		
		for(int i=1; i<L.size(); i++) {
			
			if(L.get(i-1) >= L.get(i))
				continue;
			else
				return false;
		}
		
		return true;
	}
	
	/// utility function to generate a random list of given size and upper bound
	public static List<Integer> generateRandomList(int n, int bound) {
		List<Integer> randomList = new ArrayList<>(n);
		Random random = new Random();
		
		for(int i=0; i<n; i++) {
			randomList.add(random.nextInt(bound));
		}
		return randomList;
	}
	
	/// utility function to fill a list of given size with a given number
	public static List<Integer> fillList(int n, int num) {
		List<Integer> dummyList = new ArrayList<>(n);
		
		for(int i=0; i<n; i++) {
			dummyList.add(num);
		}
		
		return dummyList;
	}

}
