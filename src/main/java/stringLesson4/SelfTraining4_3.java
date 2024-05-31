package stringLesson4;

public class SelfTraining4_3 {
//    Given string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
//    If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged
//    fizzString("fig") → "Fizz"
//    fizzString("dib") → "Buzz"
//    fizzString("fib") → "FizzBuzz"

    public static void main(String[] args) {
        SelfTraining4_3 selfTraining4_3 = new SelfTraining4_3();
        boolean success = selfTraining4_3.fizzString("Fig", "dib", "Fid");


    }

private boolean fizzString(String strF, String strB, String strFB) {
        boolean success = false;

        if (strF.startsWith("f") || strB.startsWith("f") || strFB.startsWith("f")) {
            System.out.println("Fizz");
        } else if (strFB.charAt(strFB.length()-1) == 'd')  {
            System.out.println("Buzz");
        }
    return success;
}

}
