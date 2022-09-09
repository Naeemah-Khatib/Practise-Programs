//T - O(n), S - O(n)

class Solution {
    public int findDuplicate(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.keySet().contains(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        
        for(int i: map.keySet()){
            if(map.get(i)>1)
                 return i;          
        }
        return 0;
    }
}

//T - O(n), S - O(1)
class Solution {
    public int findDuplicate(int[] nums) {
        while (nums[0] != nums[nums[0]]) {
            int nxt = nums[nums[0]];
            nums[nums[0]] = nums[0];
            nums[0] = nxt;
        }
        return nums[0];
    }
}
