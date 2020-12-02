package hooo;

import java.util.*;
public class Input {
	// A Function to generate a random permutation of arr[] 
    static void randomize( int arr[], int n) 
    { 
        // Creating a object for Random class 
        Random r = new Random(); 
           
        // Start from the last element and swap one by one. We don't 
        // need to run for the first element that's why i > 0 
        for (int i = n-1; i > 0; i--) { 
               
            // Pick a random index from 0 to i 
            int j = r.nextInt(i); 
               
            // Swap arr[i] with the element at random index 
            int temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
        } 
  
        // Prints the random array 
        System.out.println(Arrays.toString(arr)); 
    } 
	public static void main(String[] args) {
		int [] arr = {34,23,45,45,23,21};
		int n = arr.length; 
		 System.out.println("Displayed all scores(not in random)");
	        for(int i=0;i<arr.length;i++ ) {
	        	System.out.print(arr[i] + " " );
	        }
	      //average
        	int f = 0, sum=0;
        	double average;
        	 for(int i = 0; i < n ; i++)
             {
                 
                 sum = sum + arr[i];
             }
             
             average = (double)sum / n;
             System.out.println("\n\nAverage:"+average);
             
           //average with bonus
         	double avg;
         	int newSum=0;
         	System.out.println("\nTest Scores with a 5pt bonus");
         	
         	for(int j=0; j<arr.length;j++) {
         	
         		sum =arr[j] + 5; 
         		System.out.print(sum+ " ");
         		newSum = newSum + sum; 
         	 }
         		
         	 
              avg = (double)newSum / arr.length;
              System.out.println("\n\nAverage:"+avg);
             	             
		
		System.out.println("\nRandom Input in an Array");
        randomize (arr, n); 
        
        System.out.println("\nDisplayed all randomized scores");
        for(int i=0;i<arr.length;i++ ) {
        	System.out.print(arr[i] + " ");
        }
      
	 
 }

}
