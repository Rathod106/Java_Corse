import java.util.Arrays;
public class ArraySort_Decending {

	    public static void main(String[] args) {
	        // Given array of strings
	        String[] letters = {"A", "X", "D", "Z", "Y", "C", "W", "B"};
	        
	        // Sort the array in ascending order
	        Arrays.sort(letters);
	        
	        // Reverse the array to get descending order
	        int left = 0;
	        int right = letters.length - 1;
	        
	        while (left < right) {
	            // Swap elements
	            String temp = letters[left];
	            letters[left] = letters[right];
	            letters[right] = temp;
	            
	            left++;
	            right--;
	        }
	        
	        // Output the sorted array in descending order
	        System.out.println("Sorted array in descending order: " + Arrays.toString(letters));
	    }
	} 

/*Output
Sorted array in descending order: [Z, Y, X, W, D, C, B, A]
*/