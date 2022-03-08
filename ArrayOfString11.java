package Assistedpracticeproject;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfString11 {

//Write a program to search String entered by a user from the Array of Strings


	public static void main(String agrs[]) {

		String[] array = {"ramesh","dileep","sriram","rahul"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string :: ");
		String input = sc.next();
		if(Arrays.asList(array).contains(input)) {

			System.out.println("true");

		}
		else {
			System.out.println("false");
		}

	}

}
	


