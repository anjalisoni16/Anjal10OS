/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Arrays;
import java.util.Scanner;
public class Arraydisp
{
	public static void main(String[] args) {
		String[] a =new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Original array:");
		for(int i=0;i<a.length;i++){
		    System.out.println("Enter string:");
		    a[i]=sc.nextLine();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
		    System.out.println(a[i]);
		}

	}
}
