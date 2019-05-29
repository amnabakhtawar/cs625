class Bsort {
  public static void main(String args[]) {
	int num[] = {3, 4, 7, 37, 41 , 2, 1, 8, 9, 5} ;
	int a , b , t ;
	int i ;
	int size ;
	size = 10 ;

	System.out.print("THE ORIGINAL ARRAY IS : ") ;

	for(i=0;i<size;i++) 
	  System.out.print(" " + num[i]) ;
	System.out.println();

	for(a=1;a<size;a++)
	  for(b=size-1; b>=a ; b--) {
	     if(num[b-1] > num[b]) {
	        t = num[b-1] ;
		num[b-1] = num[b] ;
		num[b] = t ;
		}
	}
	System.out.print("THE SORTED ARRAY IS :") ;
	
	for(i=0;i<size;i++)
	  System.out.print(" " + num[i] ) ;
	System.out.println();
     }
}
	  