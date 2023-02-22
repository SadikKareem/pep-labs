

public class InsertPosition {

    /**
     * Find the position that a number should be inserted into in a sorted array.
     * For instance, in the array {2,4,6,8,10}, inserting 5 would belong at position 2, since the resulting array
     * would be {2,4,5,6,8,10}, where the index of 5 is 2 (remember zero-indexing.)
     * See the test cases for more examples.
     *
     * You may assume no duplicate values.
     *
     * @param nums an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted array.
     */
    public int searchInsert(int[] nums, int target) {
        // i need a start and end index to use in the while loop.
        int startIndex = 0;
        int lastIndex = nums.length -1;
        while(startIndex <= lastIndex){
            int theIndex = (startIndex + lastIndex) / 2;
            if(nums[theIndex] == target){
                return theIndex;
            }else if(nums[theIndex] > target){
                lastIndex = theIndex -1;
            }else{
                startIndex = theIndex +1;
            }
        }
        return startIndex;
    }

}
