package com.practice;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		List<Integer> lists = Arrays.asList(10, 30, 40, 54);

		//System.out.println(lists.get(3));
		
		//System.out.println(lists.size());
		
		for (int i = 0; i<lists.size(); i++) {
			System.out.println(lists.get(i));
		}
	}

}
