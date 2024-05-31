package lesson3;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class Test4 {

    public static void main(String[] args) {

        Test4 crushOrange = new Test4();

        crushOrange.taste ("Cola", "Orange", 0.33, "Drink");

    }

    private void taste (String name, String name2, double size, String drink) {
        System.out.println();

        String s = "Java";
        String str = "dog";
        //str = null;

        System.out.println(s.toUpperCase().length());
        System.out.println(str.toUpperCase());
    }


}
