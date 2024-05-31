package stringLesson4;

public class ReverseString {

    // Reverse dog --> god
    //get the last letter (length-1) add it as first letter of the new word

    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        reverseString.reverseString("dog");


    }

    public void reverseString(String textToRvrs) {
        if (textToRvrs == null || textToRvrs.isEmpty() || textToRvrs.isBlank()) {
            System.out.println("The String is null or empty");
        } else {

            System.out.println(String.format("The input string is %s", textToRvrs));

            String result = "";
            int lastLetter = textToRvrs.length() - 1;
            for(int i = lastLetter; i >= 0; i--) {
                result = result + textToRvrs.charAt(i);
            }
            System.out.println(result);
        }


    }
}
