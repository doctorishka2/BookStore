package lesson3;

public class Test1Plus2Plus3 {

    public static void main(String[] args) {

        int a = 1;
        int b = 3;


        for (int i = a + 1; i <= b; i++) {
            a += i;
        }
        System.out.println(a);
    }


}
