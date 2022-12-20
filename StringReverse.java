package com.kavitha.practicejava;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		String[] words = input.split("\\s+");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i]+" " );
		}
	}
}
