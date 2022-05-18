public class solution2 {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        int i;
        if(nums.length==0)
            return true;
        for(i=0;i<n-1;i++){
            if(nums[i]<=nums[i+1])
                continue;
            else
                break;
        }
        if (i==n-1)
            return true;
        for(i=0;i<n;i++)
            if(nums[i]>=nums[i+1])
                continue;
            else
                break;
        if(i==n-1)
            return true;
        
        return false;
        
    }
}
