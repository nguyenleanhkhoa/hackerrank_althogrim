package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Diagonal_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(11, 2, 4); 
		List<Integer> list2 = Arrays.asList(4, 5, 6); 
		List<Integer> list3 = Arrays.asList(10, 8, -12); 
		List<List<Integer>> arr = Arrays.asList(list1,list2,list3);
		System.out.println(diagonalDifference( arr));
	}
    public static int diagonalDifference(List<List<Integer>> arr) {
       int a = 0;
        int b = 0;
        for(int i = 0 ;i < arr.size();i++ ){
        	  System.out.println(arr.get(i).get(i));
    		  a += arr.get(i).get(i);        
        	  for(int y = arr.get(i).size() -1  ; y >= 0;y--) {
        		      
              
              	int max = ( arr.get(i).size() -1) -i;
              	if(y == max) {
              		b += arr.get(i).get(y);
                  	
              		break;
              	}
              	
              }
        }
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        return  Math.abs(a-b);
    }


}
