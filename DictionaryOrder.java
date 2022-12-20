package com.kavitha.practicejava;

import java.util.Arrays;

public class DictionaryOrder {
	public static void main(String[] args) {
		String[] words = { "cat", "dog", "apple", "banana", "Monkey" };

		Arrays.sort(words);

		System.out.println(Arrays.toString(words));
	}
}
