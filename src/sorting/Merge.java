package sorting;

import helper.Helper;

public class Merge {

	private static void merge(Comparable<Object> a[],Comparable<Object> aux[],int lo,int mid,int hi){
		assert Helper.isSorted(a,lo,mid);
		assert Helper.isSorted(a,mid+1,hi);
		
		for(int k = lo;k <= hi;k++)
			aux[k] = a[k];
		
		int i=lo, j=mid+1;
		for(int k = lo;k <= hi;k++){
			if(i > mid) 							a[k] = aux[j++];
			else if (j > hi)  						a[k] = aux[i++];
			else if (Helper.less(aux[j],aux[i])) 	a[k] = aux[j++];
			else 						  			a[k] = aux[i++];
		}
	}
	
	public static void sort(Comparable<Object> a[],Comparable<Object> aux[],int lo,int hi){
		if(hi <= lo) return;
		int mid = lo + (hi - lo)/2;
		sort(a,aux,lo,mid);
		sort(a,aux,mid+1,hi);
		merge(a,aux,lo,mid,hi);
	}
	
	public static void sort(Comparable<Object> a[]){
		Comparable[] aux = new Comparable[a.length];
		sort(a,aux,0,a.length-1);
	}
}
