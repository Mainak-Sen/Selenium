package work.Selenium.Day1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMap_Implementation {
    private static void find_duplicates(String input) {
    	 LinkedHashMap<Character,Integer> hm= new LinkedHashMap<Character,Integer>();
    	 for(char c: input.toCharArray())
    	 {
    		 hm.put(c,hm.getOrDefault(c,0)+1);
    	 }
    	 
    	 for(Entry<Character,Integer> e:hm.entrySet())
    	 {
    		 System.out.println(e.getKey()+"-"+e.getValue());
    	 }
    	 
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//occurence of duplicate characters
		find_duplicates("koushik"); 
		
	}

}
