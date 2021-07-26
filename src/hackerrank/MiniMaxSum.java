package hackerrank;

import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(256741038 ,623958417, 467905213 ,714532089, 938071625);
		miniMaxSum(list);
	}
	
	public static int getMinNum(List<Integer> arr) {
		int min = -1;
		for (int i = 0; i < arr.size(); i++) {
			for (int x = i; x < arr.size(); x++) {
				if (arr.get(i) >= arr.get(x)) {

					min = arr.get(x);
				}

			}
			if (min != -1) {
				break;
			}
		}
		return min;
	}
	
	public static int getMaxNum(List<Integer> arr) {
		int max = -1;
		for (int i = 0; i < arr.size(); i++) {
			for (int x = i; x < arr.size(); x++) {
				if (arr.get(i) <= arr.get(x)) {

					max = arr.get(x);
				}

			}
			if (max != -1) {
				break;
			}
		}
		return max;
	}
	
	List<Integer> list = Arrays.asList(256741038 ,623958417, 467905213 ,714532089, 938071625);
	
	public static void miniMaxSum(List<Integer> arr) {
		// Write your code here
		int min = 0;
		int max = 0;
		int a = -1;
		int b = -1;
		
		a= getMinNum(arr);
		b= getMaxNum(arr);

		for (int y = 0; y < arr.size() -1 ; y++) {
			if (arr.get(y) != b) {
				min += arr.get(y);
			}
		}
		for (int x = 0; x < arr.size(); x++) {
			if (arr.get(x) != a) {
				System.out.println(max + " + " + arr.get(x));
				max += arr.get(x);
			}
		}
		System.out.print(min);
		System.out.print(" ");
		System.out.print(max);
	}

}
