import javax.lang.model.util.ElementScanner6;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
         int array1Length = arr1.length;
        int array2Length = arr2.length;
        int newArraySize = array1Length + array2Length;

         int[] combinedArrays = new int[newArraySize];

         for(int i = 0; i < array1Length; i++){
            combinedArrays[i] = arr1[i];
         }
         for(int j = 0; j < array2Length; j++){
            combinedArrays[array1Length + j] = arr2[j];
         }
         //another way to do is use an if loop.
         
        //first we make an new array that is the size of the two arrays combined.
        /*int[] combinedArrays = new int[arr1.length + arr2.length];
        int arr1Index = 0;
        int arr2Index = 0;
        for(int i = 0; i < combinedArrays.length; i++){
            if(arr1Index < arr1.length && arr2Index < arr2.length){
                combinedArrays[i] =arr1[arr1Index];
                //after putting the value at arr1Index, you need to increment
                arr1Index++;

           }else if(arr1Index < arr1.length){
                combinedArrays[i] = arr1[arr1Index];
                arr1Index++;
            }else{
                combinedArrays[i] = arr2[arr2Index];
                arr2Index++;
            }
            

        }
        */


        return combinedArrays;
    }
}
