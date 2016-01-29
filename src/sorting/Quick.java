package sorting;

import helper.Helper;
import shuffle.Shuffle;

public class Quick {
final static int CUTOFF=20;
	public static int partition(Comparable<?> a[],int lo,int hi){
		int i = lo, j = hi+1;
		while(true){
			while(Helper.less(a[++i],a[lo]))
				if(i == hi) break;
			
			while(Helper.less(a[lo], a[j--]))
				if(j == lo) break;
			
			if(i >= j) break;
			Helper.exch(a, i, j);
		}
		Helper.exch(a,lo,j);
		return j;
	}
	
	public static void sort(Comparable<?> a[]){
		Shuffle.shuffle(a);
		sort(a,0,a.length-1);
	}
	
	public static void sort(Comparable<?>[] a,int lo,int hi){
		if(hi <= lo + CUTOFF - 1) {      //insertion sort for elements <= 20
			Insertion.sort(a,lo,hi);
			return;
			}
		int j = partition(a,lo,hi);
		sort(a,lo,j-1);
		sort(a,j+1,hi);
	}
}
