class BigShort2 {
	public static void main(String args[]) {
		int num[] = {34, 1, 15, -6, 5} ;
		int min, max;
		min = max = num[0] ;
		for(int i=0;i<5;i++){
			if(num[i] < min) min = num[i] ;
			if(num[i] > max) max = num[i] ;
		}
		System.out.println("min and max : " + min + " " + max ) ;
	}
}