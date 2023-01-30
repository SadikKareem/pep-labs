
public class ArrayAbsoluteValue {
    /**
     * Given an array of integers 'nums', produce an array of integers composed of the absolute values of all the
     * numbers in 'nums'. Absolute value represents the distance from zero, so negative numbers should become positive
     * and positive numbers should stay the same.
     *
     * @param nums an array.
     * @return the absolute value array of nums.
     */
    public int[] getArrayAbs(int[] nums){
        //first, i need to create an array that i can add the values to when i traverse nums in a for loop and change the negative values

        int[] finalArray = new int[nums.length];

        
        for(int i = 0; i < nums.length; i++){
            
            finalArray[i] = Math.abs(nums[i]);
            
        }
        return finalArray ;

    }
}