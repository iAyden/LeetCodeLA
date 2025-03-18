import java.util.HashMap;
import java.util.Arrays;
public class hashtable {
	public static void main(String[] args) {
		solutionhash so = new solutionhash();
		int[] nums = {3,3,5,5};
		System.out.println(Arrays.toString(so.twoSum(nums,8)));
	}
}

class solutionhash{
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> empSum = new HashMap<>();
		int l = nums.length;
		for(int i = 0;i<l;i++) {
			int complement = target - nums[i];
			if(empSum.containsKey(complement) && empSum.get(complement)!=i) {
				return new int[] {empSum.get(complement), i};
			}
			System.out.println(empSum);
			empSum.put(nums[i], i);
		}

		return new int[] {};
		}
		
}