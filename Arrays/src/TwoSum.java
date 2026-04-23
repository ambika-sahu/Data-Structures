/*Problem:
Given an array of integers nums and an integer target, return indices of two numbers that add up to target.
You may assume exactly one solution, and you can't use same element twice.*/

public class TwoSum {
    int[] arr;
    int target;
    public static int[] twoSum(int[] arr, int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
