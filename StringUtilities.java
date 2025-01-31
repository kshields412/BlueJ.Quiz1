
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder sb = new StringBuilder();
        String[] reverse = valueToBeReversed.split(" ");

        for (int i = reverse.length-1; i >= 0; i++) {
            sb.append(i).append("");
        }
        return valueToBeReversed;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        String str = word;
        int stringLength = str.length();
        int middle = stringLength/2;
        char c = str.charAt(middle);
        for (int i = middle; i <str.length(); i++){
            return c;
        }for (int i = 0; i < middle; i++){
            return c;
        }
        return c;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        char [] c = value.toCharArray (); 
        String result = "";
        for (int i=0; i< value.length();i++){
            char letter = c[i]; 
            if (letter != charToRemove){
                result += letter;
            }
        }
        return result;

    }
    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] parts = sentence.split(" ");
        String lastWord = parts[parts.length - 1];
        return lastWord;
    }
}
