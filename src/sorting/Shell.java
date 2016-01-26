package sorting;


import helper.Helper;

public class Shell {

	public static void sort(Comparable<Object> a[]){
		int N = a.length;
		
		int h = 1;
		while (h < N/3) h = 3*h + 1; // 1,4,13,40,..
		
		while(h >= 1){    //start h-sorting until h<1
		
			for(int i = h;i < N;i++){
				for(int j = i;j >= h && Helper.less(a[j],a[j-h]);j -= h)
						Helper.exch(a,j,j-h);
			}
			h = h/3;
		}
	}
	
}
