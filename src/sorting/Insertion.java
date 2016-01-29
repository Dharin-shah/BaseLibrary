/**
 * 
 */
package sorting;

import helper.Helper;


/**
 * @author Dharin
 *
 */
public class Insertion {

	
	public static void sort(Comparable<?> a[]){
		sort(a,0,a.length-1);
	}
	
	public static void sort(Comparable<?> a[],int lo,int hi){
		for(int i = lo;i <= hi;i++)
			for(int j = i;j > 0 ;j--)
				if(Helper.less(a[j],a[j-1]))
					Helper.exch(a, j, j-1);
				else break;
	}
}
