class Solution {
    public List<Integer> majorityElement(int[] nums) {
       HashMap<Integer,Integer> count = new HashMap<>();
       List<Integer> res = new ArrayList<>();
       int find = nums.length / 3;
       for(int num:nums){
        count.put(num,count.getOrDefault(num,0)+1);
       } 
       for(int key:count.keySet())
        if(count.get(key) > find){
            res.add(key);
        }
       return res;       
    }
}