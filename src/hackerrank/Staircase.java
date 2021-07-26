package hackerrank;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staircase(6);
	}
	   public static void staircase(int n) {
		    // Write your code here
		   for(int i = 0;i < n;i++) {
			   for(int x = 0 ;x < n;x++) {
				
				  if(x >= ((n-1) - i) ) {
					  print("x");
					 
				  } else {
					  print("-");
				  }
					 
				
			   }
			   System.out.println();
		   }
		    }
	   
	  public static void println(String n) {
		  System.out.println(n);
	  }
	  public static void print(String n) {
		  System.out.print(n);
	  }

}
