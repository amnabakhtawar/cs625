class BigShort {
	public static void main(String args[]) {
		int num[] = new int[5] ;
		int min, max ;
		num[0] = 56 ;
		num[1] = -8 ;
		num[2] = 35 ;
		num[3] = -2 ;
		num[4] = 11 ;
		max = min = num[0] ;
		for(int i=1 ; i<5 ; i++) {
		   if(num[i] < min) min = num[i] ;
		   if(num[i] > max) max = num[i] ;
		}
		System.out.println("min and max : " + min + " " + max ) ;
	}
}