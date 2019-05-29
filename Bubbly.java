class Bubbly {
	public static void main(String args[]) {
		int num[] = {12, 50, 5, 27, 1} ;
		int a, b, t ;
		int size ;
		size = 5 ;
		System.out.print("The original array is ") ;
		for(int i=0;i<5;i++)
			System.out.print(" " + num[i]) ;
		System.out.println() ;
		for(a=1;a<size;a++) 
			for(b=size-1;b>=a;b--) {
				if(num[b-1] > num[b]) {
				   t = num[b-1] ;
				   num[b-1] = num[b] ;
				   num[b] = t ;
				}
			}
		System.out.print("The array is after sorting ") ;
		for(int i=0;i<5;i++)
			System.out.print(" " + num[i]) ;
	    System.out.println();
	}
}