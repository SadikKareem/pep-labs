
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        
        //i am going to assign the value of the first string to a string object and compare it's length
        //to value of "i" in the for loop.

        String longestString = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > longestString.length()){
                //if string at "i" is longer than string at "longestString"
                //string i is now assigned to longestString.,
                longestString = arr[i];
            }
        }
        return longestString;
    }
}
