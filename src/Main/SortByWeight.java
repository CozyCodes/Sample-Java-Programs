package Main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*Number Weight
Given a set of numbers like <10, 36, 54,89,12> write a program to find sum of weights based on the following conditions
    1. 5 if a perfect square
    2. 4 if multiple of 4 and divisible by 6
    3. 3 if even number*/

public class SortByWeight {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> hash_map = new TreeMap<Integer, Integer>(Collections.reverseOrder()); 	
    int[] num = new int[] {10 ,36, 54, 89, 12};
    int[] numCount = new int[num.length];
    for(int i=0;i<num.length;i++) {
    	if(perfectSquare(num[i])) {
    		numCount[i] += 5;
    	}
        if(num[i] %6 == 0 && num[i] % 4 == 0 ) {
    		numCount[i] += 4;	
    	}
         if(num[i] %  2 == 0) {
    		numCount[i] += 3;	
    	}
         hash_map.put(numCount[i],num[i]);
    }
//    Map<Integer,Integer> sortedMap = new TreeMap<Integer,Integer>(hash_map);
    
    for(Map.Entry<Integer,Integer> entry: hash_map.entrySet()) {
    	System.out.print("("+ entry.getKey()+ " , "+ entry.getValue() +") ");
    	
    }
    
		/*
		 * for(int i=0;i<num.length-1;i++) { if(numCount[i] > numCount[i+1]) {
		 * System.out.print("( "+ num[i]+ " , "+ numCount[i] +"),"); }
		 * 
		 * }
		 */
    
	}

	static boolean perfectSquare(int x) {
		double y = (double)x;
		
		double z = Math.sqrt(y);
	
		if((z - Math.floor(z)) == 0) {
			return true;
		}
		
		return false;
	}
	
}
