public class solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true, descreasing = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                continue;
			} else {
                descreasing = false;
                break;
			}
	    }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                continue;
		    } else {
                increasing = false;
                break;
			}
        }
        return increasing || descreasing;
    }
}
