import java.util.*;

public class FundamentalProblems {
    public static void main( String args[]){

    }
    // find missing number from range 0 to n in an arrray
    public static int findMissingNumber(int[] arr){
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<=arr.length;i++){
            if(!(set.contains(i))){
                return i;
            }
        }

        return -1;
    }

    public static boolean checkPermutation( String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])return false;
        }
        return true;
    }

    public static boolean checkPermutationUsingMap(String s1, String s2){
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();
        for(char ch: s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch: s2.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        if(map1.equals(map2))return true;
        return false;

    }
    public static boolean checkPermutationUsingMapOptimised(String s1, String s2){
        if(s1.length()!=s2.length())return false;
        HashMap<Character,Integer> map1= new HashMap<>();

        for(char ch: s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch: s2.toCharArray()){
            if (!map1.containsKey(ch))return false;
            map1.put(ch,map1.get(ch)-1);
            if(map1.get(ch)<0)return false;
        }
        return true;

    }
    public int[] twoSum(int[] arr, int target){

        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            map.put(arr[i],i);

        }
        return new int[]{-1,-1};
    }
    public List<List<String>> groupAnagrams(String[] arr){
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:arr){
            char[] st=str.toCharArray();
            Arrays.sort(st);
            String group=new String(st);
            if (!map.containsKey(group)){
                map.put(group,new ArrayList<>());
            }
            map.get(group).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length())return false;

        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1); Arrays.sort(arr2);
        String str1=""; String str2="";
        for(int i=0;i<arr1.length;i++){
            str1+=arr1[i];
            str2+=arr2[i];
        }
        return str1.equals(str2);
    }
}
