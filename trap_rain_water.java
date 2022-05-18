public class trap_rain_water {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        
		// maintains max elevation on left of current index 
        for(int i = 1; i < leftMax.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i-1]);
        }
        
		// maintains max elevation to right of current index
        for(int j = rightMax.length - 2; j >= 0 ; j--){
            rightMax[j] = Math.max(rightMax[j+1], height[j+1]);
        }
        
        int trapped = 0;
        for(int k = 0; k < height.length; k++){
			// water gets trapped only if min of maxLeft and maxRight is greater than current elevation
			// otherwise water overflows
			
            int surplus = Math.min(leftMax[k], rightMax[k]);
            if(surplus > height[k]){
                trapped+=(surplus-height[k]);
            }
        }
        
        return trapped;
    }
}
