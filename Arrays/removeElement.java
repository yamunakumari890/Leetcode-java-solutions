package Arrays;

import java.util.Scanner;

public class removeElement {
  public static int removeElement(int[] nums, int val){
    int k = 0;

    for(int i=0; i<nums.length; i++) {
      if(nums[i] != val) {
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size of Array: ");
    int n = sc.nextInt();
    int[] nums = new int[n];

    System.out.print("Enter " + n + " elements: ");
    for(int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    System.out.print("Enter value to remove: ");
    int val = sc.nextInt();

    int newLength = removeElement(nums, val);

    System.out.println("New length = " + newLength);
    System.out.println("Modified Array: ");
    for(int i=0; i<newLength; i++) {
      System.out.print(nums[i] + " ");
    }
    sc.close();
  }
}
