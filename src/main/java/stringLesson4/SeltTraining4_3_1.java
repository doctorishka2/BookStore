package stringLesson4;

public class SeltTraining4_3_1 {

    // Return true if the given string contains a "bib" string, but where the middle 'i' char can be any char.
//bigThere("xycbib") → true
//bigThere("b9b") → true
//bigThere("bac") → false
    public static void main(String[] args) {

        SeltTraining4_3_1 seltTraining4_3_1 = new SeltTraining4_3_1();
        seltTraining4_3_1.stringInclude("bac");
        boolean success = true;
    }

    private boolean stringInclude(String bib) {


        if (bib.contains("bib") || bib.contains("b")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        return true;
    }
}