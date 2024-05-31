package stringLesson4;

public class SelftTraining4_1 {
//    Given a string, take the last char and return a new string with the last char
//    added at the beginning and the end, so "dog" will become "gdogg". The original
//    string should be length 1 or more.
//    backAround("dog") → "gdogg"
//    backAround("red") → "dredd"
//    backAround("xy") → "yxyy"
public static void main(String[] args) {
        SelftTraining4_1 selftTraining1 = new SelftTraining4_1();
               selftTraining1.addLetters("dog", "red", "xy");
    }

    public static void addLetters (String sobaka, String color, String coordinates ){

        if (sobaka.length() >= 1 && color.length() >= 1 && coordinates.length() >= 1) {
            System.out.println(sobaka.charAt(sobaka.length()-1) + sobaka + sobaka.charAt(sobaka.length()-1));
            System.out.println(color.charAt(color.length()-1) + color + color.charAt(sobaka.length()-1));
            System.out.println(coordinates.charAt(coordinates.length()-1) + coordinates + coordinates.charAt(coordinates.length()-1));
        } else
            System.out.println(sobaka + " " + color + " " + coordinates);

    }

}
