package helper;

//import interfaces.Comparable;

public final class Helper {
	
	public static boolean less(Comparable v,Comparable w){
		if(!v.getClass().isInstance(w))
			/* weird though helps me debug */
			throw new ClassCastException("Objects not of Same Class"); 
		/* This warning is suppressed because v and w are checked for being of same class */
		@SuppressWarnings("unchecked")
		int result = v.compareTo(w); 
		return  result < 0;
	}
	
	public static void exch(Comparable<?>[] a,int i,int j){
		Comparable<?> temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static boolean isSorted(Comparable<?> a[]){
		return isSorted(a,0,a.length-1);
	}
	
	public static boolean isSorted(Comparable<?> a[],int from,int to){
		for (int i=from;i<to+1;i++)
			if(!less(a[i],a[i+1])) return false;
				return true;
	}
}
