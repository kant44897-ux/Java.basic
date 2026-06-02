public int[] twoSum(int[] nums, int target) {
        for( int i = 0; i < nums.length; i++){
            for( int j = i + 1; j < nums.length; j++){
                int currSum = nums[i] + nums[j];
                if( currSum == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
public int majorityElement(int[] nums) {
        
        for( int i = 0; i < nums.length; i++){
            int count = 0;
            for( int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length/2){
            return nums[i];
          }
        }
        return -1;
    }
}
