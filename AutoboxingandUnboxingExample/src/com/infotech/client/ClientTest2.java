package com.infotech.client;

import java.util.ArrayList;
import java.util.List;

/* Java program to illustrate autoboxing */
public class ClientTest2 {

	public static void main(String[] args) {

		/*
		 * Here we are creating a list of elements of Integer type. adding the
		 * int primitives type values
		 */
		List<Integer> list = new ArrayList<Integer>();
		for (int n = 0; n < 10; n++){
			list.add(n);//list.add(Integer.valueOf(n));
		}

		for (Integer i : list) {
			System.out.println(i);
		}
	}
}
