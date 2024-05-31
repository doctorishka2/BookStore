package stringLesson4;

public class SelfTraining4_4 {

//        Given a string and a non-negative int n, return a larger string that is n copies of the original string
//        stringTimes("Hi", 2) → "HiHi"
//        stringTimes("Hi", 3) → "HiHiHi"
//        stringTimes("Hi", 1) → "Hi"

    public static void main(String[] args) {

        SelfTraining4_4 selfTraining4_4 = new SelfTraining4_4();
        selfTraining4_4.stringTimes("Hi", 14);
    }

        public void stringTimes(String str, int n) {

            String temp = "";

            for (int i = 0; i < n; i++)

            temp += str;

            System.out.println(temp);
    }

    }
