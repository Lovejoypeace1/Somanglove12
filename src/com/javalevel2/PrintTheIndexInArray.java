package com.javalevel2;

import java.lang.reflect.Array;

public class PrintTheIndexInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5 };
		int target = 5;
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				sum = array[i] + array[j];

				if (sum == target) {

					System.out.println(i + " " + j);

				}
			}

		}

	}
}
