import java.util.HashMap;
import java.util.Scanner;
public class WordFrequencyCounter{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String word=sc.nextLine();
        System.out.printf("the frequency of "+ word+" is: "+wordFrequencyCounter(text,word));
    }
    public static int wordFrequencyCounter(String text,String word){
        String[] txtArr=text.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String wrds:txtArr){
            String wrd=wrds.toLowerCase();
            if (!map.containsKey(wrd)) {
                map.put(wrd,1);
            }else{
                map.put(wrd,map.get(wrds)+1);
            }
        }
        return map.get(word);
    }
}