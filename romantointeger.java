package xd;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
public class RomanToInteger {
	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.romanToInt("MCMXCIV"));
	}
}

class Solution {
    public int romanToInt(String s) {
    	HashMap<Integer,String> romanMap = new HashMap<>();
    	String[] arr = s.split("");
    	int[] values = new int[arr.length];
    	int result = 0;
    	System.out.println(Arrays.toString(arr));
    	romanMap.put(1,"I");
    	romanMap.put(5,"V");
    	romanMap.put(10,"X");
    	romanMap.put(50,"L");
    	romanMap.put(100,"C");
    	romanMap.put(500,"D");
    	romanMap.put(1000,"M");
    	System.out.println(romanMap);
    	for(int i = 0;i<arr.length;i++) {	
    		for(Entry<Integer, String> entry : romanMap.entrySet()) {
    			if(entry.getValue().equals(arr[i])) {
    				values[i] = entry.getKey();
    			}
    			
    		}
    		result += values[i];
    		
    	}
    	
    	for(int i=0;i<arr.length-1;i++) {
    		System.out.println("caca: " +arr[i]+arr[i+1]);
    		if((arr[i].equals("I") && arr[i+1].equals("V"))) {
    			System.out.println("En la I");

    			result -=2;
    			System.out.println(result);
    		}
    		if(arr[i].equals("I") && arr[i+1].equals("X")){
    			System.out.println("En la X");
    			
    			result -=2;
    		}
    		if((arr[i].equals("X")) && (arr[i+1].equals("L")) || (arr[i+1].equals("C"))) {
    			result-=10;
    		}
    		if((arr[i].equals("C")) && (arr[i+1].equals("D")) || (arr[i+1].equals("M"))) {
    			
    			result-=200;
    		}	
    	    			
    		System.out.println("Resultado: " +result);
    		
    	}

    	int y = result;
    	return y;
    }
}