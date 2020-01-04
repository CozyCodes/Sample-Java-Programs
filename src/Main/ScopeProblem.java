package Main;

import java.util.Arrays;
import java.util.Scanner;

public class ScopeProblem {

	class Difference {

		private int[] elements;
		
	  	public Difference(int[] a) {
			elements = a;
			Arrays.sort(elements);
		}
		
	  	public int maximumDifference;
	  	
	  	
		public void computeDifference() {
			maximumDifference = elements[1] - elements[0];
			
			for(int i = 0; i<elements.length;i++) {
				for(int j = i+1; j<elements.length;j++) {
					
					if(elements[j] - elements[i] > maximumDifference) {
						maximumDifference = elements[j] - elements[i];
					}
				}	
			}
			
		}

		// Add your code here

	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        ScopeProblem scope = new ScopeProblem();
        Difference difference = scope.new Difference(a);

        difference.computeDifference();

//        System.out.print(difference.maximumDifference);
        System.out.print(maxDiff(a,n));
	}

	   static int maxDiff(int arr[], int arr_size)  
	    { 
	        int max_diff = arr[1] - arr[0]; 
	        int i, j; 
	        for (i = 0; i < arr_size; i++)  
	        { 
	            for (j = i + 1; j < arr_size; j++)  
	            { 
	                if (arr[j] - arr[i] > max_diff) 
	                    max_diff = arr[j] - arr[i]; 
	            } 
	        } 
	        return max_diff; 
	    }
}
