import javax.lang.model.util.ElementScanner6;

public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * cat < car < care
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){
        //first i need to find the array with less size to use in my loop.
        int minSizeArray = Math.min(a.length, b.length);
        for(int i =0; i < minSizeArray; i++){
            if(a[i] == b[i]){
                //the reason we cannot return 0 here because the two arrays might be identical so far is because
                //we don= not know if they are of the same size.
                continue;
            }else if(a[i] < b[i]){
                return -1;
            }else {
                return 1;
            }
        }if(a.length == b.length){
            return 0;
        }else return 1;
    }
}
