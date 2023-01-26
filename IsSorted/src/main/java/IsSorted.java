public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        //use a for loop so that i can use the greater than operator to compare two values.
        for(int i = 0; i < arr.length -1; i++){
            //if the value at first index is greater than second value, array is not sorted because
            //is supposed to be from smallest to biggest.
            
            if(arr[i] > arr[i + 1])
            return false;
        }
        return true;
    }
}
