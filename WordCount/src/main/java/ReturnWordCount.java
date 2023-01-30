
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        //i know that \\s looks for spaces between strings
        int wordCount = in.split("\\s").length;
        return wordCount;

    }
}
