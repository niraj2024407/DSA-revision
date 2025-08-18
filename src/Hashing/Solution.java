package Hashing;

import java.util.HashMap;

class Solution {
    public int mostFrequentElement(int[] nums) {
        int n = nums.length;
        int maxFreq = 0;
        int maxEl = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int ele : map.keySet()){
            int freq = map.get(ele);

            if(freq>maxFreq){
                maxFreq = freq;
                maxEl = ele;
            }else if(freq == maxFreq){
                maxEl = Math.min(maxEl, ele);
            }
        }
        return maxEl;
    }

    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6};
        Solution sol = new Solution();
        int ans = sol.mostFrequentElement(nums);
        System.out.println("The highest occurring element in the array is: " + ans);
    }
}



