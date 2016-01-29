package shuffle;

import helper.Helper;
import java.util.Random;

public final class Shuffle {
 private final static Random rand = new Random();
 
	 private Shuffle(){
		 
	 }
	 
	 private static Random getInstance(){
		 return rand;
		 }
 
	public static void shuffle(Comparable<?> a[]){
		int N  = a.length;
		Random n = Shuffle.getInstance();
		for(int i = 0; i < N; i++)
		Helper.exch(a,i,n.nextInt(i+1));
	}
}
