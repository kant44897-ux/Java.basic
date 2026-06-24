136.   public int singleNumber(int[] nums) {
        int ans = 0; 
        for( int i = 0; i < nums.length; i++ ) {
            ans = ans ^ nums[i];
        }                                            // revise bitwise ope
        return ans;
    }
}
287.   public int findDuplicate(int[] nums) {
        for ( int i = 0; i < nums.length - 1; i++ ) {
            for ( int j = i + 1; j < nums.length; j++ ) {
                if ( nums[ i ] == nums[ j ] ) {
                    return nums[ i ];
                }
            }
        }
        return -1;
    }
}
560.  public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currSum = 0;
        for ( int i = 0; i < nums.length; i++ ) {
            currSum = 0;
            for ( int j = i; j < nums.length; j++ ) {
                currSum += nums[j];
                if ( currSum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
26.  public static int repeted(int n , int are[] ) {
       int i = 0; 
       for( int j = 1; j < n; j++ ) {
           if(are[i] != are[j]){
               i++;
               are[i] = are[j];
               
           }
       }
       return i + 1;
   } 
33. public int search(int[] nums, int target) {
        int low = 0; 
        int high = nums.length - 1;

        while( low <= high){
            
            int mid = (low + high)/2;
            if( nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= nums[low]){
                if( target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
              } else{
             if( target > nums[mid] && target <= nums[high]){
                low = mid + 1;
                 }else {
                high = mid - 1;
                 }
            }
        }
        return -1;
    }
}

11. public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;

        while(i < j){
            int b = j - i;
            int h = Math.min(height[i] , height[j]);
            int area = h * b;
            maxArea = Math.max(maxArea , area);
            if(height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }
            return maxArea;
        }
        
}
1. public int[] twoSum(int[] nums, int target) {
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
