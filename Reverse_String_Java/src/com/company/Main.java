package com.company;
import javafx.scene.text.TextBoundsType;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Please Enter a string : ");
		Scanner read = new Scanner(System.in);
		String s = read.nextLine();
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--)
		{
			r += s.charAt(i);
		}
		System.out.println("String Reversed is now : ");
		System.out.println(r);
	}
}
