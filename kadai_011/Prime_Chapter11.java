package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		 
		
	  boolean[] primeJudge = new boolean[101];
      for( int i = 1; i < primeJudge.length; i++) {
    	  primeJudge[i] = true;
      }
      
      int number = 2;
      while (number < primeJudge.length) {
      
         for( int i = number + 1; i < primeJudge.length; i++) {
    	  
    	 
    		  if( i % number == 0) {
    			  primeJudge[ i ] = false;
    			  continue;
    		  }
   	      }
         
         number += 1;
    	  
      }
      
      for ( int i = 1; i < primeJudge.length; i++) {
    	  if( primeJudge[i] ) {
    		  System.out.println(i);
    	  }
       }
	}
}
