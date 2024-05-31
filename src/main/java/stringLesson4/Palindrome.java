package stringLesson4;

public class Palindrome {

    public static void main(String[] args) {

        Palindrome isPalindrome = new Palindrome();
        boolean success = isPalindrome.verifyWord("racecar");
        System.out.println("racecar is palindrome : " + success);
    }

    private boolean verifyWord(String str) {

        if (str.length() == 0 || str.length() == 1) {
            return true;
        } else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        } else
            return verifyWord(str.substring(1, str.length() - 1));

    }

}