package client;

import sorting.*;

public class SortingClient {

	public static void main(String abc[]){
		String a[] = {"z","b"}; 
		Merge.sort(a);
		Quick.sort(a);
		Insertion.sort(a);
		Selection.sort(a);
		Shell.sort(a);
		print(a);
		
	}
	
	public static void print(Object[] a){
		for (Object s: a){
			System.out.println(s);
		}
	}
}
