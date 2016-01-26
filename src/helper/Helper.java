package helper;

public final class Helper {
	
	public static boolean less(Comparable<Object> v,Comparable<Object> w){
		if(!v.getClass().isInstance(w))
			throw new ClassCastException("Objects not of Same Class");
		return v.compareTo(w) < 0;
	}
	
	public static void exch(Comparable<Object>[] a,int i,int j){
		Comparable<Object> temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static boolean isSorted(Comparable<Object> a[]){
		return isSorted(a,0,a.length-1);
	}
	
	public static boolean isSorted(Comparable<Object> a[],int from,int to){
		for (int i=from;i<to+1;i++)
			if(!less(a[i],a[i+1])) return false;
				return true;
	}
}
