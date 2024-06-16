package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		 
		
	  boolean[] scoreArray = new boolean[100];
      for( int p = 0; p < scoreArray.length; p++) {
    	  scoreArray[p] = true;
      }
      
      for( int i = 2; i <= 100; i++) {
    	  
    	  for( int r = 2; r < i; r++) {
    		  if( i % r == 0) {
    			  scoreArray[ i - 1 ] = false;
    			  break;
    		  }
    	  }
    	  
      }
      
      for ( int k = 0; k < scoreArray.length; k++) {
    	  if( scoreArray[k] == true) {
    		  System.out.println(k + 1);
    	  }
      }
	}

}
