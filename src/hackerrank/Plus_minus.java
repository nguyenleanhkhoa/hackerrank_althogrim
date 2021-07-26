package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plus_minus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listInt = Arrays.asList(-4, 3, -9, 0, 4, 1);
		plusMinus(listInt);
	}
	

    public static void plusMinus(List<Integer> arr) {
    	float a = 0;
    	float b = 0;
    	float c = 0;
    	for(int i =0 ;i < arr.size();i++ ) {
    		if(arr.get(i) > 0) {
    			a+=1;
    		} else if(arr.get(i)<0) {
    			b+=1;
    		} else {
    			c+=1;
    		}
    		
    	}
    	
    	System.out.println(Float.parseFloat(String.valueOf(a/arr.size())));
    	System.out.println(Float.parseFloat(String.valueOf(b/arr.size())));
    	System.out.println(Float.parseFloat(String.valueOf(c/arr.size())));

    }


}
