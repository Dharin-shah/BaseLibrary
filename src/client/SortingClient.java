package client;

import helper.Helper;
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
		//Helper.less(new Integer(5), "hello");
		Helper.exch(new Integer[]{1,2,3}, 0, 1);
		print(a);
	}
	
	public static void print(Object[] a){
		for (Object s: a){
			System.out.println(s);
		}
	}
}
