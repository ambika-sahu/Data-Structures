
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String [] args){
        String txt=",mlook at the stars, look  how they shine for you, and all thethings you do , they were all yellow.";
        HashMap<Character,Integer> map=charCounter(txt);
        char firstCharMap=firstChar(txt);
        System.out.println(firstCharMap);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
//        txt.toCharArray();
//        System.out.println(txt
//
//        );

    }
    //find the first character that appears once
        //character that appear once
    public static char firstChar(String text){
        //to lower the text
        String ltext=text.toLowerCase();
        String clean=ltext.replaceAll("[^a-z]","");
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<clean.length();i++){
            char ch=clean.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }

        }
        for(char chr:clean.toCharArray()){
            if(map.containsKey(chr)&& map.get(chr)==1){
                System.out.println(chr);
                return chr;
            }
        }
        return '?';
    }
    public static HashMap<Character,Integer> charCounter(String txt){
        HashMap<Character,Integer> map=new HashMap<>();
        String ltxt=txt.toLowerCase();
        String clean=ltxt.replaceAll("[^a-z;]","");
        for(int i=0;i<clean.length();i++){
            char ch=clean.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }
        return map;

    }
}
