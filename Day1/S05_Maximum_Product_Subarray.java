class S05_Maximum_Product_Subarray { // Optimal solution
    public static int maxProduct(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0; 
        }

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for(int i=1; i<nums.length; i++) {
            if(nums[i] < 0) { //swap
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // update minProd and maxProd
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            // update result
            result = Math.max(result, maxProd);

        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}