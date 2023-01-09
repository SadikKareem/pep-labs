import java.util.Arrays;

public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        
        //i created an object of type int "theMaxNumber" and set it's value to the value of the first index in arr and compared to the rest only changing it when i find higher value.
        
        int theMaxNumber = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(theMaxNumber < arr[i]){
                theMaxNumber = arr[i];
            }
        }

        
        
        //i could also use the built in "sort()" function in arrays that will sort the array in order smallest to biggest and return the value at the end of the array.
        /*Arrays.sort(arr);
         theMaxNumber = arr[arr.length -1];
        

        return theMaxNumber;
        */

        return theMaxNumber;


    }
}
