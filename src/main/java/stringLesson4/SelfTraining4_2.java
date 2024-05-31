package stringLesson4;

public class SelfTraining4_2 {
//    Return true if the given string begins with "max", except the 'm' can be anything, so "pax", "9ax" .. all count.
//    maxStart("max snacks") → true
//    maxStart("pax snacks") → true
//    miaStart("paz snacks") → false
//    public boolean maxStart(String str) {
//    }

    public static void main(String[] args) {
        SelfTraining4_2 selfTraining4_2 = new SelfTraining4_2();
        boolean success = selfTraining4_2.maxStart("max snacks", "pax snacks", "paz snacks");
    }

    private boolean maxStart(String maxS, String paxS, String pazS) {
        boolean success = true;

        if (maxS.startsWith("ax", 1)) {
            System.out.println(success);
        } else if (paxS.startsWith("ax", 1)) {
            System.out.println(paxS + " " + success);
        } else if (pazS.startsWith("ax", 1)) {
            System.out.println(pazS + " " + success);
        } else {
            System.out.println(false);
        }
        return success;
    }


}
