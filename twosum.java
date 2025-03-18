import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		Solution so = new Solution();
		int[] nums = {2,5,5,11,2,3,4,6,7,8,33};
		System.out.println(Arrays.toString(so.twoSum(nums, 44)));
		
	}
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	int e = nums.length; //No se necesita la biblioteca de Arrays para sacar el length de un array int[]
        for(int i = 0;i<=e;i++) {
        	for(int y = i+1;y<e;y++) {
        		if(nums[i] + nums[y] == target) { //No se necesita almacenar una variable de "resultado"
        			return new int[] {i,y}; // Tampoco es necesario declarar otra variable en otra linea
        		}
        	}
         }
        return new int[] {}; //Si se puede retornar un array de int vacío 
    }
}	