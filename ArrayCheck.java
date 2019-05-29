class ArrayCheck {
  public static void main(String args[]) {
	int sample[] ;
	sample = new int[5] ;
	int min , max ;
	int i ;

	sample[0] = 15 ;
	sample[1] = -2 ;
	sample[2] = 7 ;
	sample[3] = 5 ;
	sample[4] = 17 ;

	min = sample[0] ;
	max = sample[0] ;

	for(i=1;i<5;i++) {
	  if(sample[i] < min) min = sample[i] ;
	  if(sample[i] > max) max = sample[i] ;
	}
	System.out.println("Min and Max : " + min + " " + max ) ;
     }
} 