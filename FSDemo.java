class FSDemo{
     public static void main(String args[]){
       FailSoftArray fs = new FailSoftArray(5, -1);
       int x;
       //Show quiet Failures.
       System.out.println("Fail Quietly.");
       for(int i=0; i<(fs.length*2); i++)
           fs.put(i, i*10);
       for(int i=0; i<(fs.length*2); i++){
           x=fs.get(i);
           if(x !=-1)
           System.out.println(x + " ");
       }
       System.out.println(" ");
     //Now, handle errors.
     System.out.println("\nFail with Error Reports.");
     for(int i=0; i<(fs.length*2); i++)
           if(!fs.put(i, i*10));
            System.out.println("Index" +i+ "Out of Boundary.");
     for(int i=0; i<(fs.length*2); i++){
         x = fs.get(i);
         if(x !=-1)
         Sytem.out.println(x+ " ");
         else
         System.out.println("Index" +i+ "Out of Boundary.");
      }
   }
}     