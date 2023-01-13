
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        //Here is my thought process.
        //the easiest way to get the Min and Max is tow sort the list.
        Collections.sort(nums);
        //we know that after sorting the nums, our minimum value is at index 0.
        int myMin = (nums.get(0));
        //i am using mvn test that is provided to see these outputs and although the tests fail, i get the sense of the process.
            //System.out.println("Min value is" + myMin);
        //now getting the max value, we need the value at index size() -1;
        int myMax = nums.get(nums.size()-1);
            //System.out.println("Max value is" + myMax);

            //System.out.println("your list is" + nums);
        
        return myMax - myMin;
    }
}
