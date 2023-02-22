
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        //i need to keep track of the max value and second max value;
        //first make sure those variable have the lowest numbers in them.
        int maxValue = Integer.MIN_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;
        int maxValue2 = Integer.MIN_VALUE;
        
        //use a for loop to traverse through nums and update maxValue and secondMaxValue
        for(int i = 0; i < nums.size(); i++){
            //i need a temporary variable to compare to my out of this scope variables and change accordingly
            int temp = nums.get(i);
            if(temp >= maxValue){
                maxValue2 = maxValue;
                //now am gonna put the number i found inside the maxValue variable
                maxValue = temp;
            }else if(temp > maxValue2){
                maxValue2 = temp;
            }if(temp > secondMaxValue && temp < maxValue2){
                secondMaxValue = temp;
            }
        }
        return Math.max(maxValue + secondMaxValue, maxValue + maxValue2);
    }
}