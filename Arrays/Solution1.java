package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1 {
  public boolean uniqueOccurrences(int[] arr){
    Map<Integer, Integer> freqMap = new HashMap<>();
    for(int num : arr) {
      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    Set<Integer> freqSet = new HashSet<>();
    for(int freq : freqMap.values()){
      if(!freqSet.add(freq)) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args){
    Solution1 sol =  new Solution1();

     int[] arr = {1, 2, 2, 1, 1, 3};
        boolean result = sol.uniqueOccurrences(arr);

        System.out.println("Are occurrences unique? " + result);
  }
  
}
