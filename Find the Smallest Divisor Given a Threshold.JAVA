class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max= 0;
        int ans =0;
                
        for(Integer i:nums)
        {            
            max = Math.max(max,i);
        }
        
        int n = nums.length;
        
        int l = 1;
        int h = max;
        
        while(l<=h)
        {
            int mid = l + (h-l)/2;
            
            int sum = 0;
            
            for(int i=0;i<n;i++)
            {
                sum += Math.ceil((double) nums[i]/mid);
            }  
            
                        
            if(sum<=threshold)
            {         
                ans = mid;
                h = mid-1;
            }
            else
            {
                l = mid+1;
            }            
        }
        
        return ans;
    }
}
