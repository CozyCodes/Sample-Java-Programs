package Main;

public class SpiralTraverse {

	public static void main(String[] args) {
		
		int m =4;
		int n=4;
        int[][] num = {{1, 2, 3, 4}, 
        		       {5, 6, 7, 8},
        		       {9, 10, 11, 12}, 
        		       {13, 14, 15, 16}};
        spiralTraverse(m,n,num);

	}
	
	static void spiralTraverse(int m, int n, int[][] arr) {
		int top = 0;
		int bottom = m-1;
		int left = 0;
		int right = n-1;
		int dir = 1;
		
		while(top <= bottom && left <= right) {
			
			// left to right
		      if(dir ==1){

		          // left to right
		          for(int i =left;i<=right;i++){
		              System.out.println(arr[top][i]+ " ");
		          }
		          dir = 2;
		          top++;
		      }

		      // top to bottom
		      if(dir == 2) {
		    	 
		    	  for(int i = top; i<= bottom;i++) {
		    		  System.out.println(arr[i][right]);
		    	  }
		    	  dir =3;
		    	  right--;
		      }
		      
		      // right to left
		      if(dir == 3) {
		    	  for(int i = right; i>= left;--i) {
		    		  System.out.println(arr[bottom][i]);
		    	  }
		    	  dir = 4;
		    	  bottom--;
		      }
		      
		      //bottom to top
		      if(dir ==4) {
		    	  for(int i = bottom; i>= top; --i) {
		    		System.out.println(arr[i][left]);  
		    	  }
		    	  dir = 1;
		    	  left++;
		      }
			
		}
		
	}

}
