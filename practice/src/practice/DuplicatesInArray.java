package practice;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {1,1,3,4,2,4,2,3,3,6,7,8,5,5};
		
		
		List<Integer> dplist = DuplicatesInArray.findDuplicatesByLooping(arr);
		for(int el : dplist) {
			System.out.println(el);
		}
		
		
	}
	 public static List<Integer> findDuplicatesByLooping(int[] arr) {
	        List<Integer> duplicates = new ArrayList<>();
	        
	        for (int i = 0; i < arr.length; i++) {
	            // Skip if we've already identified this as a duplicate
	            boolean alreadyInDuplicates = false;
	            for (int dup : duplicates) {
	                if (arr[i] == dup) {
	                    alreadyInDuplicates = true;
	                    break;
	                }
	            }
	            
	            if (alreadyInDuplicates) {
	                continue;
	            }
	            
	            // Check if this element appears elsewhere in the array
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    duplicates.add(arr[i]);
	                    break;
	                }
	            }
	        }
	        
	        return duplicates;
	    }


}
