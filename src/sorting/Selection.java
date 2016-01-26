package sorting;


import helper.Helper;

public class Selection<Item> {

	public static void sort(Comparable<Object> a[]){
		int N = a.length;
		for(int i=0;i<N;i++){   
			int min = i;
			for(int j=i+1;j<N;j++)
				if(Helper.less(a[j],a[min]))
					min = j;
					Helper.exch(a,i,min);
						
		}		
	}
}
